package com.hemanth.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("cktr")
@PropertySource(value="com/hemanth/commons/Info.properties")
public class Cricketer {
	
	@Value("${cktr.name}")
	private String name;
	@Value("${cktr.jersyNo}")
	private int jerseyNo;
	
	
	
	public Cricketer() {
		System.out.println("Cricketer.: 0-Param Constructor");
	}


	public void fielding() {
		System.out.println(name+" With jerseyNo "+jerseyNo+" is Fielding");
	}
	
	
	public void wicketKeeping() {
		System.out.println(name+" With jerseyNo "+jerseyNo+" is WicketKeeper");
	}
	
	public void bowling() {
		System.out.println(name+" With jerseyNo "+jerseyNo+" is Bowling");
	}
	
	
	public void batting() {
		// Creating an extra container
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/hemanth/cfgs/applicationContext.xml");
		
		// perform dependency lookup to get bat object(Dependent Class Obj) 
//		 CricketBat bat = ctx.getBean("bat", CricketBat.class);  // lookup with dependent beanId
		
		CricketBat bat = ctx.getBean(CricketBat.class);  // even If the bean name changes need not to worry about that  ==========lookup with dependent class name
		//Invoke the business method
		int runs = bat.scoreRuns();
		
		System.out.println(name+" has scored "+runs+" runs.");
	} 
	

}
