package online.mobwell.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyValues {
	final String PROPFILENAME = System.getProperty("user.dir") + "/resources/config.properties";
	final String PROPFILENAME_LOCAL = "config.properties";
	InputStream inputStream;
	Properties prop;

	public PropertyValues() {
		prop = new Properties();
		loadPropertyValues();
	}

	private void loadPropertyValues() {

		try {
 
//			inputStream = getClass().getClassLoader().getResourceAsStream(PROPFILENAME);
			inputStream = new FileInputStream(PROPFILENAME_LOCAL);

 
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" +PROPFILENAME+ "' not found in the classpath");
			}
 
			inputStream.close();
 
			// get the property value and print it out
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
		}
	}

	/**
	 * @return the prop
	 */
	public Properties getProp() {
		return prop;
	}

	/**
	 * @param prop the prop to set
	 */
	public void setProp(Properties prop) {
		this.prop = prop;
	}

}
