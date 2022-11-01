package com.hemanth.beans;

public class A {
	
	private B b;
	
	

	
	public A(B b) {
		System.out.println("A : 1-Param Constructor");
		this.b = b;
	}




	/*
	 * public A() { System.out.println("A : 0-Param Constructor"); }
	 * 
	 * 
	 * public void setB(B b) { System.out.println("A.setB()"); this.b = b; }
	 */


	@Override
	public String toString() {
//		return "A [b=" + b + "]"; this gives stack trace error
		return "A [b=]";
	}

}
