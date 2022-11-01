package com.hemanth.comp;

public class Customer extends Person{
	private int transactionId;
	private double billAmount;
	
	
	
	public Customer(String name, String addrs, AadharDetails aadharDetails, int transactionId, double billAmount) {
		super(name, addrs, aadharDetails);
		System.out.println("Customer:5-Param Constructor");
		this.transactionId = transactionId;
		this.billAmount = billAmount;
	}

	@Override
	public String toString() {
		return super.toString()+" Customer [transactionId=" + transactionId + ", billAmount=" + billAmount + "]";
	}
	
	
}
