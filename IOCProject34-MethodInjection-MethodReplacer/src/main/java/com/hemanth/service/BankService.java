package com.hemanth.service;

public class BankService {
	
	public double calculateInterestAmount(double pamt, double price, double rate, double time) {
		System.out.println("BankService.calculateInterestAmount()  Coumpound Interest Amount");
		return pamt*Math.pow((1+rate/100), time)-pamt;
	}

}
