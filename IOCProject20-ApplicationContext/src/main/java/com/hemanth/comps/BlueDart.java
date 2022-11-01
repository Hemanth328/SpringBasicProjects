// Dependent Class 2

package com.hemanth.comps;

public final class BlueDart implements Courier {  // rule2 & rule3
	
	public BlueDart() {
		System.out.println("BlueDart: 0-Param Constructor"); 
	}
	
	@Override
	public String deliver(int id) {
		return id + " Order ID assigned to BlueDart for Delivery ";
		
	}

}
