package com.hemanth.beans;

public class Student {

	private int sno;
	private String sname;
	private String sadd;
	private double avg;
	private String course;
	
	// Constructor for constructor Injection
	
	/*
	 * public Student(int sno, String sname, String sadd, double avg) {
	 * System.out.println("Student:: 4-param constructor"); this.sno = sno;
	 * this.sname = sname; this.sadd = sadd; this.avg = avg; }
	 */ 

	public Student(int sno, String sname, String sadd) {
		System.out.println("Student : 3-Param Constructor");
		this.sno = sno;
		this.sname = sname;
		this.sadd = sadd;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	
	
	
	/*
	 * public void setSno(int sno) { System.out.println("Student.setSno()");
	 * this.sno = sno; }
	 * 
	 * public void setSname(String sname) {
	 * System.out.println("Student.setSname()"); this.sname = sname; }
	 * 
	 * public void setSadd(String sadd) { System.out.println("Student.setSadd()");
	 * this.sadd = sadd; }
	 * 
	 * public void setAvg(double avg) { System.out.println("Student.setAvg()");
	 * this.avg = avg; }
	 */
	
	// toString() to display the data
		@Override
		public String toString() {
			return "Student [sno=" + sno + ", sname=" + sname + ", sadd=" + sadd + ", avg=" + avg + ", course=" + course
					+ "]";
		}

}
