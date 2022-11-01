// Factory Class
package com.hemanth.factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.hemanth.comps.BlueDart;
import com.hemanth.comps.Courier;
import com.hemanth.comps.DTDC;
import com.hemanth.comps.Flipkart;

//Factory Pattern
public class FlipkartFactory {
	
	private static Properties props;
	
	static {
		System.out.println("FlipkartFactory Static Block");
		try {
			// Locating the properties file through stream
			InputStream is = new FileInputStream("src/main/java/com/hemanth/commons/info.properties");
			// Loading the properties file content to java.util.Properties class obj
			props = new Properties();
			props.load(is);
		} catch(IOException ioe) {
			ioe.printStackTrace(); 		}
	}
	
  	// static factory method
	public static Flipkart getInstance() throws Exception { 
		
		System.out.println("FlipkartFactory.getInstance()");
		
		//get Dependent class name
		
		String courierClassName = props.getProperty("courier.classname");
		// Loading the dependent class
		Class c = Class.forName(courierClassName);
		
		// create the object for loaded class
		Constructor cons[]= c.getDeclaredConstructors();
		
		Courier courier = (Courier)cons[0].newInstance();	
		
		
		
		/*
		 * // TO avoid Type Casting
		 * 
		 * Constructor<Courier> cons[]= c.getDeclaredConstructors();
		 * 
		 * Courier courier = cons[0].newInstance();
		 * 
		 */
		
		
				
		Flipkart fpkt = new Flipkart();
		
		fpkt.setCourier(courier);
		
		return fpkt;
	}

}
