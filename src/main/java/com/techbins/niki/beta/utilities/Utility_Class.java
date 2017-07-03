package com.techbins.niki.beta.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility_Class {
	
	
	public String Reading_properties(String SKey) throws IOException
	{
		
		FileInputStream fis= new FileInputStream("Configuration.properties");
		Properties prop= new Properties();
		
		prop.load(fis);
		
		return prop.getProperty(SKey);
		
		
		
	}

}
