package com.hemanth.comp;

public class AadharDetails{
	private long aadharNumber;
	private int age;
	private long mobileNumber;
	
	
	
	public AadharDetails(long aadharNumber, int age, long mobileNumber) {
		System.out.println("AadharDetails.AadharDetails()");
		this.aadharNumber = aadharNumber;
		this.age = age;
		this.mobileNumber = mobileNumber;
	}



	@Override
	public String toString() {
		return "AadharDetails [aadharNumber=" + aadharNumber + ", age=" + age + ", mobileNumber=" + mobileNumber + "]";
	}
	
	
}
