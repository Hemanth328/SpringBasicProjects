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
	
	@Autowired
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
