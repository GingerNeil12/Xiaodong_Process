package com.nearlam.services;

import java.util.ArrayList;
import java.util.List;

import com.nearlam.JSON.CompanyJsonMapper;
import com.nearlam.UrlConnectors.GetConnector;
import com.nearlam.UrlConnectors.PostConnector;
import com.nearlam.UrlConnectors.PutConnector;
import com.nearlam.datamodels.company.CompanyAddModel;
import com.nearlam.datamodels.company.CompanyResponseModel;
import com.nearlam.datamodels.company.CompanyUpdateModel;
import com.nearlam.datamodels.contact.ContactAttachModel;
import com.nearlam.datamodels.region.RegionAttachModel;
import com.nearlam.models.Company;
import com.nearlam.models.Contact;
import com.nearlam.models.Region;
import com.nearlam.validators.CompanyValidator;
import com.nearlam.validators.IValidate;

public class CompanyService implements ICompanyService
{
	private CompanyJsonMapper mapper;
	private GetConnector getConnector;
	private PostConnector postConnector;
	private PutConnector putConnector;
	private IValidate<Company> validator;
	private String error;
	
	public CompanyService()
	{
		mapper = new CompanyJsonMapper();
		getConnector = new GetConnector();
		postConnector = new PostConnector();
		putConnector = new PutConnector();
		validator = new CompanyValidator();
		error = "";
	}
	
	public String getError()
	{
		return error;
	}
	
	@Override
	public List<CompanyResponseModel> getAll()
	{
		String json = getConnector.getResponse("company");
		List<Company> companies = mapper.deserializeList(json);
		List<CompanyResponseModel> response = new ArrayList<CompanyResponseModel>();
		for(Company company : companies)
		{
			response.add(new CompanyResponseModel(
					company.getId(),
					company.getName(),
					company.getAddress(),
					company.getCity(),
					company.getRegionId(),
					new RegionAttachModel(),
					new ArrayList<ContactAttachModel>()));
		}
		return response;
	}

	@Override
	public CompanyResponseModel getById(int id)
	{
		String json = getConnector.getResponse("company/" + id);
		Company company = mapper.deserialize(json);
		List<ContactAttachModel> contacts = new ArrayList<ContactAttachModel>();
		
		for(Contact contact : company.getContacts())
		{
			contacts.add(new ContactAttachModel(
					contact.getId(),
					contact.getFirstName(),
					contact.getLastName(),
					contact.getEmail(),
					contact.getPhoneNumber()));
		}
		
		RegionAttachModel region = new RegionAttachModel(
				company.getRegion().getId(),
				company.getRegion().getName(),
				company.getRegion().getCountry());
		
		CompanyResponseModel response = new CompanyResponseModel(
				company.getId(),
				company.getName(),
				company.getAddress(),
				company.getCity(),
				company.getRegionId(),
				region,
				contacts);
		return response;
	}

	@Override
	public boolean add(CompanyAddModel entity)
	{
		Company company = new Company(
				0,
				entity.getName(),
				entity.getAddress(),
				entity.getCity(),
				entity.getRegionId(),
				new Region(),
				new ArrayList<Contact>());
		
		if(validation(company) == false)
		{
			return false;
		}
		String json = mapper.serialize(company);
		boolean added = postConnector.postObject("company", json);
		if(added == false)
		{
			error = "Entry not added";
		}
		return true;
	}

	@Override
	public boolean update(CompanyUpdateModel entity)
	{
		Company company = new Company(
				entity.getId(),
				entity.getName(),
				entity.getAddress(),
				entity.getCity(),
				entity.getRegionId(),
				new Region(),
				new ArrayList<Contact>());
		
		if(validation(company) == false)
		{
			return false;
		}
		
		String json = mapper.serialize(company);
		String path = "company"+entity.getId();
		boolean updated = putConnector.putObject(path, json);
		if(updated == false)
		{
			error = "Entry not updated";
			return false;
		}
		return false;
	}
	
	private boolean validation(Company company)
	{
		validator.setEntity(company);
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
