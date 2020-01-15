package com.Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReading {
	public static String getProperty(String FileName,String key) throws IOException
	{
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\TestBase\\"+FileName+".properties");
		Properties properties = new Properties();
		properties.load(fis);
		String value=properties.getProperty(key);
		return value;
	}

}
