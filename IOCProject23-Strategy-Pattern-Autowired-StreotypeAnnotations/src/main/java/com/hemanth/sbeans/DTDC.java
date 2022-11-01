// // Dependent Class 1
package com.hemanth.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public final class DTDC implements Courier{ // rule2 & rule3
	
	public DTDC() {
		System.out.println("DTDC: 0-Param Constructor"); 
	}
	
	
	
	@Override
	public String deliver(int id) {
		return id + " Order ID assigned to DTDC for Delivery ";
		
	}

}
