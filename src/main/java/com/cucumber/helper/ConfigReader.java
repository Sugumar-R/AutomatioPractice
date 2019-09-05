package com.cucumber.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
public Properties pr=new Properties();

public ConfigReader() throws Throwable
{

	try
	{
	File propfile=new File(System.getProperty("user.dir")
		+"\\src\\test\\java\\com\\selenium\\properties\\Configuration.properties");

	FileInputStream fis =new FileInputStream(propfile);
	pr.load(fis);
} 
	
	catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	throw new Exception();
}
	}



public String getBrowserName() throws Exception

{
String browser = pr.getProperty("BrowserName");
if (browser == null) {
	throw new Exception("Enter a valid BrowserName");
	}
return browser;

}
public String geturl() throws Exception
{

	String url = pr.getProperty("Url");
	if (url==null) {
		throw new Exception("Enter a valid Url");
		}
		return url;
		
	}
}


