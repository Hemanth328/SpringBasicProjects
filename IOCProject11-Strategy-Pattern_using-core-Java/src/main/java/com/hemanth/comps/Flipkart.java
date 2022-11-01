// Target Class

package com.hemanth.comps;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart { // final class (rule -3)
	
	// HAS-A Property (rule 1)
	public Courier courier;  //(Interface reference type (rule 2)
	
	public Flipkart() {
		System.out.println("Flipkart : 0-Param constructor");
	}
	
	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier(-)");
		this.courier = courier;
	}
	
	
	public String shopping(String[] items, double[] price) {
		System.out.println("Flipkart.shopping()");
		
		double billAmt =0.0;
		
		for(double p:price) {
			billAmt+=p;
		}
		
		int old = new Random().nextInt(1000000);
		
		String msg = courier.deliver(old);
		
		return Arrays.toString(items)+ " are purchased having bill amount "+billAmt+" ----> "+msg;
	}

}


/* Rule1, Rule2 &* Rule3 comes under Strategy pattern */
