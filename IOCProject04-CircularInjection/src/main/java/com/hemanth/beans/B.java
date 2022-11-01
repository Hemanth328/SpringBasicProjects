package com.hemanth.beans;

public class B {
	
	private A a;
	
	

	
	public B(A a) {
		System.out.println("B : 1-Param Constructor");
		this.a = a;
	}




	/*
	 * public B() { System.out.println("B : 0-Param Constructor"); }
	 * 
	 * 
	 * public void setA(A a) { System.out.println("B.setA()"); this.a = a; }
	 */


	@Override
	public String toString() {
		/* return "B [a=" + a + "]";  this gives stack trace error */ 
		return "B [a=]";
	}
	

}
