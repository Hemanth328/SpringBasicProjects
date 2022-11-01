// Target Class

package com.hemanth.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public final class Flipkart { 
	
	// HAS-A Property 
	
//	@Qualifier("dhl") // refer to DHL Class there the class will be annotated as Primary in the absence of Qualifier here
	
	// In absence of Qualifier here check for primary or else check for whether if Dependent name is given as bean id (here we have given for FirstFlight class)
	@Autowired
//	@Qualifier("bDart")
	@Qualifier("dPartner")
	public Courier courier; 
	
	


	public Flipkart() {
		System.out.println("Flipkart 0-Pram constructor");
	}

	  
	  public String shopping(String[] items, double[] price) {
	  System.out.println("Flipkart.shopping()");
	  
	  double billAmt = 0.0;
	  
	  for(double p:price) { billAmt+=p; }
	  
	  int old = new Random().nextInt(1000000);
	  
	  String msg = courier.deliver(old);
	  
	  return Arrays.toString(items)+
	  " are purchased having bill amount "+billAmt+" ----> "+msg; }
	 
}


/* Rule1, Rule2 &* Rule3 comes under Strategy pattern */
