package com.hemanth.bo;

public class PatientBO {
	  
	/*
	 * The java bean class who object holds either persistable data (to be saved to
	 * db table) or persistant data (gathered from db table)
	 */
	
	
	private Integer pno;
	private String pname;
	private String padd;
	private Integer numofdays;
	private Float billamount;
	
	
	
	
	public Integer getPno() {
		return pno;
	}
	public void setPno(Integer pno) {
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
	
	
	public Integer getNumofdays() {
		return numofdays;
	}
	public void setNumofdays(Integer numofdays) {
		this.numofdays = numofdays;
	}
	
	
	public Float getBillamount() {
		return billamount;
	}
	public void setBillamount(Float billamount) {
		this.billamount = billamount;
	}
	
	
	
}
