// Target Class

package com.hemanth.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public final class Flipkart { 
	
	// HAS-A Property 
	@Autowired
	@Qualifier("ffgt")
	/*
	 * When we have multiple dependent injections to avoid the error we make one
	 * dependent as primary either by using Qualifier Annotation or by using
	 * Primary="true" as an attribute in config file where the respective dependent has been
	 * configured
	 */
	
	public Courier courier; 
	
	@Autowired
//	@Qualifier  (this Annotation is not applicable on Constructor but the annotation can be passes as an parameter so we pass as an parameter and make use of it)
	public Flipkart(@Qualifier("bDart") Courier courier) {
		System.out.println("===================Blue Dart Courier================================ ");
		System.out.println("Flipkart.setCourier()  "+courier.getClass());
		this.courier=courier;
		System.out.println("Flipkart : 0-Param constructor");	
	}
	
	@Autowired
	@Qualifier("dhl")
	public void aasign(Courier courier) {
		System.out.println("==================DHL Courier================================= ");
		System.out.println("Flipkart.setCourier()  "+courier.getClass());
		this.courier = courier;
		System.out.println("Flipkart.setCourier()  "+courier.getClass());
	}
	
	@Autowired
	@Qualifier("dtdc")
	public void setCourier(Courier courier) {
		System.out.println("===================DTDC Courier================================ ");
		System.out.println("Flipkart.setCourier()  "+courier.getClass());
		this.courier = courier;
		System.out.println("Flipkart.setCourier()  "+courier.getClass());
	}







	public String shopping(String[] items, double[] price) {
		System.out.println("Flipkart.shopping()");
		
		double billAmt = 0.0;
		
		for(double p:price) {
			billAmt+=p;
		}
		
		int old = new Random().nextInt(1000000);
		
		String msg = courier.deliver(old);
		
		return Arrays.toString(items)+ " are purchased having bill amount "+billAmt+" ----> "+msg;
	}

}


/* Rule1, Rule2 &* Rule3 comes under Strategy pattern */
