package com.hemanth.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dhl")
public class DHL implements Courier{
	
	public DHL() {
		System.out.println("DHL: 0-Param Constructor"); 
	}

	@Override
	public String deliver(int id) {
		return id + " Order ID assigned to DHL for Delivery ";
	}

}
