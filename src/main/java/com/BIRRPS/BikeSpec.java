package com.BIRRPS;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class BikeSpec {
	private Map properties;

	public BikeSpec( Map properties) {
		this.properties = new HashMap(properties);
	}

	public Object getProperty(String propertyName){
		return properties.get(propertyName);
	}
	public Map getProperties() {
		return properties;
	}

	// searching for bike by iterating through the properties
	public boolean matches(BikeSpec searchSpec){
		for (Iterator i = searchSpec.getProperties().keySet().iterator();
			 i.hasNext(); ){
			String propertyName = (String)i.next();
			if (!properties.get(propertyName).equals(searchSpec.getProperty(propertyName))){
						return false;
			}
		}

		return true;
		}

	}



