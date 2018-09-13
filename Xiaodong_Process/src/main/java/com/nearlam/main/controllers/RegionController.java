package com.nearlam.main.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nearlam.datamodels.region.RegionAddModel;
import com.nearlam.datamodels.region.RegionResponseModel;
import com.nearlam.datamodels.region.RegionUpdateModel;
import com.nearlam.services.IRegionService;
import com.nearlam.services.RegionService;

@RestController
@RequestMapping("/api/region")
public class RegionController
{
	IRegionService service = new RegionService();
	
	@RequestMapping(value= {"", "/", "/all"}, method=RequestMethod.GET, produces="application/json")
	public List<RegionResponseModel> all()
	{
		return service.getAll();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET, produces="application/json")
	public RegionResponseModel getById(@PathVariable(value="id")int id)
	{
		return service.getById(id);
	}
	
	@RequestMapping(value="", method=RequestMethod.POST, produces="application/json")
	public RegionAddModel add(@Valid @RequestBody RegionAddModel model)
	{
		if(service.add(model))
		{
			return model;
		}
		return new RegionAddModel();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.PUT, produces="application/json")
	public RegionUpdateModel update(@Valid @RequestBody RegionUpdateModel model)
	{
		if(service.update(model))
		{
			return model;
		}
		return new RegionUpdateModel();
	}
}
