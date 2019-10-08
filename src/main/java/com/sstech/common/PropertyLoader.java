package com.sstech.common;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyLoader {

	public static void loadProperty(String propertyFileName) throws Exception{

        File file= new File("./properties/"+propertyFileName);

FileInputStream fileInput= new FileInputStream(file );

Properties  p= new Properties();
         p.load(fileInput);

for(String k: p.stringPropertyNames()){

	System.setProperty(k, p.getProperty(k));
}
	}


public static void loadProperties() throws Exception {

loadProperty("webdriver.properties");
loadProperty("test.properties");

}

}


