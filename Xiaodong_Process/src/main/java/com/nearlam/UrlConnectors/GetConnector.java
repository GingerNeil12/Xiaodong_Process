package com.nearlam.UrlConnectors;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetConnector extends UrlConnectorBase
{
	public GetConnector()
	{
		super();
	}
	
	public String getResponse(String path)
	{
		try
		{
			URL url = new URL(baseUrl+path);
			HttpURLConnection connection = (HttpURLConnection)url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Accept", "application/json");
			
			if(connection.getResponseCode() != 200)
			{
				throw new RuntimeException("Failed: Http Error Code: " + connection.getResponseCode());
			}
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			StringBuilder sb = new StringBuilder();
			String line;
			while((line = reader.readLine()) != null)
			{
				sb.append(line);
			}
			reader.close();
			connection.disconnect();
			return sb.toString();
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
	}
}
