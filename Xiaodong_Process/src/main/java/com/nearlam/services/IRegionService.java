package com.nearlam.services;

import com.nearlam.datamodels.region.RegionAddModel;
import com.nearlam.datamodels.region.RegionResponseModel;
import com.nearlam.datamodels.region.RegionUpdateModel;

public interface IRegionService extends 
IService<RegionResponseModel>,
IAddService<RegionAddModel>,
IUpdateService<RegionUpdateModel> {

}
