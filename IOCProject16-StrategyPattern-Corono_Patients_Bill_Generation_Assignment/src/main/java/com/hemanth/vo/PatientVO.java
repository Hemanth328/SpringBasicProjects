package com.hemanth.vo;

public class PatientVO {
	
	
	/*
	 * The java bean class whose object holds either input/output data as String
	 * values is called Value Object Class
	 */
	
	private String pno;
	private String pname;
	private String padd;
	private String numofdays;
	private Float billamount;
	
	
	
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
	}
	
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	
	public String getPadd() {
		return padd;
	}
	public void setPadd(String padd) {
		this.padd = padd;
	}
	
	
	public String getNumofdays() {
		return numofdays;
	}
	public void setNumofdays(String numofdays) {
		this.numofdays = numofdays;
	}
	
	
	public Float getBillamount() {
		return billamount;
	}
	public void setBillamount(Float billamount) {
		this.billamount = billamount;
	}
	
	
}
