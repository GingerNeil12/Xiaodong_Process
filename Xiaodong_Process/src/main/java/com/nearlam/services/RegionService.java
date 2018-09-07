package com.nearlam.services;

import java.util.ArrayList;
import java.util.List;

import com.nearlam.JSON.RegionJsonConverter;
import com.nearlam.UrlConnectors.GetConnector;
import com.nearlam.datamodels.company.CompanyAttachModel;
import com.nearlam.datamodels.region.RegionResponseModel;
import com.nearlam.models.Company;
import com.nearlam.models.Region;

public class RegionService
{
	public List<RegionResponseModel> getAll()
	{
		GetConnector conn = new GetConnector();
		String response = conn.getResponse("region");
		List<Region> regions = RegionJsonConverter.getRegionListFromJson(response);
		List<RegionResponseModel> answer = new ArrayList<RegionResponseModel>();
		for(Region region : regions)
		{
			answer.add(new RegionResponseModel(
					region.getId(),
					region.getName(),
					region.getCountry(),
					new ArrayList<CompanyAttachModel>()));
		}
		return answer;
	}
	
	public RegionResponseModel getById(int id)
	{
		GetConnector conn = new GetConnector();
		String response = conn.getResponse("region/"+id);
		Region region = RegionJsonConverter.getRegionFromJson(response);
		List<CompanyAttachModel> companies = new ArrayList<CompanyAttachModel>();
		for(Company company : region.getCompanies())
		{
			companies.add(new CompanyAttachModel(
					company.getId(),
					company.getName(),
					company.getAddress(),
					company.getCity()));
		}
		RegionResponseModel model = new RegionResponseModel(
				region.getId(),
				region.getName(),
				region.getCountry(),
				companies);
		return model;
	}
}
