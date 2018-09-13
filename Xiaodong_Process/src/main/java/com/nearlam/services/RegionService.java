package com.nearlam.services;

import java.util.ArrayList;
import java.util.List;

import com.nearlam.JSON.RegionJsonMapper;
import com.nearlam.UrlConnectors.GetConnector;
import com.nearlam.UrlConnectors.PostConnector;
import com.nearlam.UrlConnectors.PutConnector;
import com.nearlam.datamodels.company.CompanyAttachModel;
import com.nearlam.datamodels.region.RegionAddModel;
import com.nearlam.datamodels.region.RegionResponseModel;
import com.nearlam.datamodels.region.RegionUpdateModel;
import com.nearlam.models.Company;
import com.nearlam.models.Region;
import com.nearlam.validators.IValidate;
import com.nearlam.validators.RegionValidator;

public class RegionService implements IRegionService
{
	private RegionJsonMapper mapper;
	private GetConnector getConnector;
	private PostConnector postConnector;
	private PutConnector putConnector;
	private IValidate<Region> validator;
	private String error;
	
	public RegionService()
	{
		mapper = new RegionJsonMapper();
		getConnector = new GetConnector();
		postConnector = new PostConnector();
		putConnector = new PutConnector();
		validator = new RegionValidator();
		error = "";
	}
	
	public String getError()
	{
		return error;
	}
	
	@Override
	public List<RegionResponseModel> getAll()
	{
		String json = getConnector.getResponse("region");
		List<Region> regions = mapper.deserializeList(json);
		List<RegionResponseModel> response = new ArrayList<RegionResponseModel>();
		for(Region region : regions)
		{
			response.add(new RegionResponseModel(
					region.getId(),
					region.getName(),
					region.getCountry(),
					new ArrayList<CompanyAttachModel>()));
		}
		return response;
	}
	
	@Override
	public RegionResponseModel getById(int id)
	{
		String json = getConnector.getResponse("region/"+id);
		Region region = mapper.deserialize(json);
		List<CompanyAttachModel> companies = new ArrayList<CompanyAttachModel>();
		for(Company company : region.getCompanies())
		{
			companies.add(new CompanyAttachModel(
					company.getId(),
					company.getName(),
					company.getAddress(),
					company.getCity()));
		}
		RegionResponseModel response = new RegionResponseModel(
				region.getId(),
				region.getName(),
				region.getCountry(),
				companies);
		return response;
	}
	
	@Override
	public boolean add(RegionAddModel entity)
	{
		Region region = new Region(
				0,
				entity.getName(),
				entity.getCountry(),
				new ArrayList<Company>());
		if(validation(region) == false)
		{
			return false;
		}
		String json = mapper.serialize(region);
		boolean added = postConnector.postObject("region", json);
		if(added == false)
		{
			error = "Entry not added";
			return false;
		}
		return true;
	}
	
	@Override
	public boolean update(RegionUpdateModel entity)
	{
		Region region = new Region(
				entity.getId(),
				entity.getName(),
				entity.getCountry(),
				new ArrayList<Company>());
		if(validation(region) == false)
		{
			return false;
		}
		String json = mapper.serialize(region);
		String path = "region/"+entity.getId();
		boolean updated = putConnector.putObject(path, json);
		if(updated == false)
		{
			error = "Entry not updated";
			return false;
		}
		return true;
	}
	
	private boolean validation(Region region)
	{
		validator.setEntity(region);
		validator.validate();
		if(validator.getErrorCount() > 0)
		{
			for(String s : validator.getErrors())
			{
				error += error + " " + s;
			}
			return false;
		}
		return true;
	}
}
