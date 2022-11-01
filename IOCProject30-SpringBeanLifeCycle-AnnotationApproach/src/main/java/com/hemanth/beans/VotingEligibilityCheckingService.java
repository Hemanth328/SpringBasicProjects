package com.hemanth.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component("voting")
@PropertySource("com/hemanth/commons/Info.properties")
public class VotingEligibilityCheckingService {
	
	@Value("${voter.name}")
	private String name;
	@Value("${voter.age}")
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
	
	// Init Life Cycle Method
	@PostConstruct
	public void myinit() {
		System.out.println("VotingEligibilityCheckingService.myinit()   PostConstruct Method");
		verifiedOn = new Date(); // Inititalization of left over property which are not participated in Injection
		if(name==null || age<=0) {
			throw new IllegalArgumentException("Invalid Input username or age");
		}
	}
	
	
	// Destroy Life Cycle Method
	@PreDestroy
	public void mydestroy() {
		System.out.println("VotingEligibilityCheckingService.mydestroy()   PreDestroy Method");
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
