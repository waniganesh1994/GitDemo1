package com.mystore.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	   
	    Properties properties;
	    
	    String path = "C:\\Users\\GaneshVilas\\eclipse-workspace\\Work\\MyStoreV1\\configuration\\config.properties";
	    
	    public ReadConfig() {
	       try {
	    	properties = new Properties();
	    	FileInputStream fis = new FileInputStream(path);
	    	properties.load(fis);
	    	
	    } catch (Exception e) {
	    	    e.printStackTrace();
	    }
	    }    
        public String getBaseUrl() {
        	   
        	    String value=properties.getProperty("baseUrl");
        	    
        	    if(value!=null)
        	    	return value;
        	    else 
        	    	throw new RuntimeException("Url is not specified in config file");
        }
        public String getBroswer() {
     	   
    	    String value=properties.getProperty("broswer");
    	    
    	    if(value!=null)
    	    	return value;
    	    else 
    	    	throw new RuntimeException("Url is not specified in config file");
    }
 }
        
        
        
