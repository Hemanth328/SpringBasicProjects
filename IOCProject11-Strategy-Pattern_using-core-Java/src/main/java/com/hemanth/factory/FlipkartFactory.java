// Factory Class
package com.hemanth.factory;

import com.hemanth.comps.BlueDart;
import com.hemanth.comps.Courier;
import com.hemanth.comps.DTDC;
import com.hemanth.comps.Flipkart;

//Factory Pattern
public class FlipkartFactory {
	
  	// static factory method
	public static Flipkart getInstance(String courierType) {
		//Creating a Dependent Class Object
		Courier courier = null;
		
		if(courierType.equalsIgnoreCase("DTDC")) {
			courier = new DTDC();
		}
		else if(courierType.equalsIgnoreCase("BlueDart")) {
			courier =new BlueDart();
		} else {
			throw new IllegalArgumentException("Invalid Courier Type");
		}
		
		// Creating Target Class Object
		
		Flipkart fpkt = new Flipkart();
		
		// Assign Dependent Class Object to Target Class Object
		
		fpkt.setCourier(courier);
		
		return fpkt;
	}

}
