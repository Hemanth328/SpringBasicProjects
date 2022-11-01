package com.hemanth.beans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class VotingEligibilityCheckingService implements InitializingBean, DisposableBean {
	
	private String name;
	private int age;
	private Date verifiedOn;
	
	
	
	public VotingEligibilityCheckingService() {
		System.out.println("VotingEligibilityCheckingService : 0-Param Constructor");
	}

	public void setName(String name) {
		System.out.println("VotingEligibilityCheckingService.setName()");
		this.name = name;
	}
	
	public void setAge(int age) {
		System.out.println("VotingEligibilityCheckingService.setAge()");
		this.age = age;
	}
	
	//afterPropertiesSEt------> Init Life Cycle Method
	public void afterPropertiesSet() {
		System.out.println("VotingEligibilityCheckingService.afterPropertiesSet()");
		verifiedOn = new Date(); // Inititalization of left over property which are not participated in Injection
		if(name==null || age<=0) {
			throw new IllegalArgumentException("Invalid Input username or age");
		}
	}
	
	
	//destroy() method ----> no change in name(As per this program as I have taken the exact method name even before) Destroy Life Cycle Method
	public void destroy() {
		System.out.println("VotingEligibilityCheckingService.destroy()");
		name = null;
		age = 0;
		verifiedOn = null;
	}
	
	// Business Method
	public String checkVotingEligibility() {
		System.out.println("VotingEligibilityCheckingService.checkVotingEligibility() "+verifiedOn+"   Business Method");
		if(age>=18)
			return "Mr/Miss/Mrs. "+name+" you are eligible for voting ";
		else
			return "Master. "+name+" you are not eligible for voting";
		
	}
	
	
	

}
