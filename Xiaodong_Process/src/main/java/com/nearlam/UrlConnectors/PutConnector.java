package com.nearlam.UrlConnectors;

import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class PutConnector extends UrlConnectorBase {
	public PutConnector()
	{
		super();
	}
	
	public boolean putObject(String path, String json)
	{
		try
		{
			URL url = new URL(baseUrl+path);
			HttpURLConnection connection = (HttpURLConnection)url.openConnection();
			connection.setRequestMethod("PUT");
			connection.setRequestProperty("Content-Type", json);
			connection.setFixedLengthStreamingMode(json.getBytes().length);
			connection.setDoOutput(true);
			
			DataOutputStream stream = new DataOutputStream(connection.getOutputStream());
			stream.writeBytes(json);
			stream.flush();
			stream.close();
			
			if(connection.getResponseCode() != 200)
			{
				throw new RuntimeException("Failed: Http Code: " + connection.getResponseCode());
			}
			return true;
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
	}
}
