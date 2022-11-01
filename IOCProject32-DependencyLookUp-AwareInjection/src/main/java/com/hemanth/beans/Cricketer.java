package com.hemanth.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("cktr")
@PropertySource(value="com/hemanth/commons/Info.properties")
//public class Cricketer implements ApplicationContextAware { (code 1)
public class Cricketer  {
	
	@Value("${cktr.name}")
	private String name;
	@Value("${cktr.jersyNo}")
	private int jerseyNo;
	
	@Autowired
	private ApplicationContext ctx;
	
	
	/*
	private ApplicationContext ctx;
	
	
	 * @Override public void setApplicationContext(ApplicationContext ctx) throws
	 * BeansException { System.out.println("Cricketer.setApplicationContext()");
	 * this.ctx= ctx; }
	 * (code 1)
	 */
	
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
		
//		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/hemanth/cfgs/applicationContext.xml");
		
		// perform dependency lookup to get bat object(Dependent Class Obj) 
//		 CricketBat bat = ctx.getBean("bat", CricketBat.class);  // lookup with dependent beanId
		
		CricketBat bat = ctx.getBean(CricketBat.class);  // even If the bean name changes need not to worry about that  ==========lookup with dependent class name
		//Invoke the business method
		int runs = bat.scoreRuns();
		
		System.out.println(name+" has scored "+runs+" runs.");
	}
	

}
