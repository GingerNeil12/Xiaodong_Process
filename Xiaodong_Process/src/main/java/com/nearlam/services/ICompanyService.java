package com.nearlam.services;

import com.nearlam.datamodels.company.CompanyAddModel;
import com.nearlam.datamodels.company.CompanyResponseModel;
import com.nearlam.datamodels.company.CompanyUpdateModel;

public interface ICompanyService extends 
IService<CompanyResponseModel>, 
IAddService<CompanyAddModel>, 
IUpdateService<CompanyUpdateModel>
{

}
