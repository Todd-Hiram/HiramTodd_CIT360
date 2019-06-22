package org.techzoo.aqsa.config;

import static java.lang.String.format;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public final class WebConfig {
	
	private static final String MAPPING = "mappings.properties";
	private Map<String, ControllerConfig> controllers = null;
	
	public WebConfig(String mappingFile) {
		File mapping = new File(mappingFile);
		System.out.println(mapping.getPath());
		if (mapping.isFile() && mapping.exists()) {
			String xmlFileName = mapping.getName();
			if (!xmlFileName.equals(MAPPING))
				throw new UnsupportedOperationException(format(
						"mapping file name should be %s.", MAPPING));
			controllers = new HashMap<String, ControllerConfig>();
			readMappingFile(mapping);
		} else {
			System.err.println("Not a Mapping file or not exist.."
					+ mapping.getPath());
		}
	}

	private void readMappingFile(File propFile) {
		Properties props = new Properties();
		try {
			props.load(new FileInputStream(propFile));
			Set<Object> keys = props.keySet();
			Iterator<Object> it = keys.iterator();
			while(it.hasNext()){
				String key = (String)it.next();
				String className = (String)props.get(key);
				ControllerConfig cc = new ControllerConfig(key, className);
				addControllerConfig(key, cc);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void addControllerConfig(String actionUrl,
			ControllerConfig controllerConf) 
	{
		if (!controllers.containsKey(actionUrl)) {
			controllers.put(actionUrl, controllerConf);
		} else throw new UnsupportedOperationException(
			format("Action %s is already exist. "
					+ "Two controller can't map to one action.",
					actionUrl));
	}
	
	public Map<String, ControllerConfig> getControllers() {
		return controllers;
	}
}
