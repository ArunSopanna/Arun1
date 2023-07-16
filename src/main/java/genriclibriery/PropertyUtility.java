package genriclibriery;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtility {
	public String readingData(String key) 
	{
	FileInputStream file=null;
	try
	{
		file=new FileInputStream("./src/test/resources/data.properties");
	}
	catch(FileNotFoundException e)
	{
		System.out.println(e.getMessage());
	}
	Properties property=new Properties();
	try {
	property.load(file);
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	return property.getProperty(key);
	}
}
