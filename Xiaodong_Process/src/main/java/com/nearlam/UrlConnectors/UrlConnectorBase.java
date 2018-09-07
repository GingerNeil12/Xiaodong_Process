package com.nearlam.UrlConnectors;

public abstract class UrlConnectorBase
{
	protected final String baseUrl;
	
	public UrlConnectorBase()
	{
		baseUrl = "http://localhost:51274/api/";
	}
}
