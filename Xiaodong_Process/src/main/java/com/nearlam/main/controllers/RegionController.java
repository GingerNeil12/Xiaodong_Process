package com.nearlam.main.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nearlam.JSON.RegionJsonConverter;
import com.nearlam.UrlConnectors.GetConnector;
import com.nearlam.datamodels.region.RegionResponseModel;
import com.nearlam.models.Region;
import com.nearlam.services.RegionService;

@RestController
@RequestMapping("/api/region")
public class RegionController
{
	@RequestMapping(value= {"", "/", "/all"}, method=RequestMethod.GET, produces="application/json")
	public List<RegionResponseModel> all()
	{
		RegionService service = new RegionService();
		return service.getAll();
	}
	
	@RequestMapping(value="/getbyid", method=RequestMethod.GET, produces="application/json")
	public RegionResponseModel getById()
	{
		RegionService service = new RegionService();
		return service.getById(1);
	}
}
