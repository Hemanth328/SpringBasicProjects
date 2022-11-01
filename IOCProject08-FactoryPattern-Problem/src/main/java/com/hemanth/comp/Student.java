package com.hemanth.comp;

public class Student extends Person{
	private String course;
	private int rollNo;
	
	

	public Student(String name, String addrs, AadharDetails aadharDetails, String course, int rollNo) {
		super(name, addrs, aadharDetails);
		System.out.println("Student:5-Param Constructor");
		this.course = course;
		this.rollNo = rollNo;
	}



	@Override
	public String toString() {
		return super.toString()+" Student [course=" + course + ", rollNo=" + rollNo + "]";
	}
	
	
}
