package com.hemanth.comp;

public abstract class Person {
	private String name;
	private String addrs;
	private AadharDetails aadharDetails;
	
	
	
	public Person(String name, String addrs, AadharDetails aadharDetails) {
		System.out.println("Person: 3-Param Contructor");
		this.name = name;
		this.addrs = addrs;
		this.aadharDetails = aadharDetails;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", addrs=" + addrs + "]";
	}
	
	
}
