package com.hemanth.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("cktr")
@PropertySource(value="com/hemanth/commons/Info.properties")
//public class Cricketer implements ApplicationContextAware { (code 1)
public abstract class Cricketer  {
	
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
		
		//get Dependent Class Object
		CricketBat bat = getBat();
		//Invoke the business method
		int runs = bat.scoreRuns();
		
		System.out.println(name+" has scored "+runs+" runs.");
	}
	
	@Lookup
	public abstract CricketBat getBat();
	

}
