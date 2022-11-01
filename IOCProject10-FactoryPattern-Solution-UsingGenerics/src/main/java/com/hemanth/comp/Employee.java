package com.hemanth.comp;

public class Employee extends Person {
	private String companny;
	private double salary;
	
	
	
	public Employee(String name, String addrs, AadharDetails aadharDetails, String companny, double salary) {
		super(name, addrs, aadharDetails);
		System.out.println("Employee:5-Param COnstructor");
		this.companny = companny;
		this.salary = salary;
	}



	@Override
	public String toString() {
		return super.toString()+" Employee [Companny=" + companny + ", Salary=" + salary + "]";
	} 
	
	
}
