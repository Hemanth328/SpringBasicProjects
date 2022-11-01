package com.hemanth.sbeans;


import org.springframework.stereotype.Component;

@Component("ffgt")
public class FirstFlight implements Courier{
	
	public FirstFlight() {
		System.out.println("FirstFlight: 0-Param Constructor"); 
	}

	@Override
	public String deliver(int id) {
		return id + " Order ID assigned to FirstFlight for Delivery ";
	}

}
