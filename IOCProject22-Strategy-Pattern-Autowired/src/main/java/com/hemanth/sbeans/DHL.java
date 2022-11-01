package com.hemanth.sbeans;

public class DHL implements Courier{
	
	public DHL() {
		System.out.println("FirstFlight: 0-Param Constructor"); 
	}

	@Override
	public String deliver(int id) {
		return id + " Order ID assigned to DHL for Delivery ";
	}

}
