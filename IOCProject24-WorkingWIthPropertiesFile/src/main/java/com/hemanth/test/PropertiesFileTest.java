package com.hemanth.test;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

import com.hemanth.sbeans.Employee;

public class PropertiesFileTest {

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/hemanth/cfgs/applicationContext.xml");
		
		
		//get Spring bean class object
		Employee emp = ctx.getBean("emp", Employee.class);
		
		// Proof for Environment Object
		
		  Environment env = ctx.getEnvironment();
		  System.out.println("Environment Object = "+env);
		  System.out.println(env.getProperty("emp.id")); 
		  System.out.println("****************************************************************");
		  System.out.println(System.getProperties());
		  System.out.println("");
		  System.out.println("");
		  System.out.println("****************************************************************");
		  Date date = ctx.getBean("dt", Date.class);
		  System.out.println(date);
		  
		 
		
		// Display Spring Bean Class Obj Data
		System.out.println("emp data :: "+emp);
		
	}

}
