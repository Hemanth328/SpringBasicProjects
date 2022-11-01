package com.hemanth.test;


import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hemanth.service.BankService;

public class MethodInjectionTest {
    public static void main (String[] args) {
       //Create IOC Container
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/hemanth/cfgs/applicationContext.xml");
    	
    	
    	//get Target Class
    	BankService service = ctx.getBean("bankService", BankService.class);
    	System.out.println(service.getClass()+"  "+service.getClass().getSuperclass()+"  "+Arrays.toString(service.getClass().getDeclaredMethods()));
    	
    	//Invoke the business Method
    	double intrAmt = service.calculateInterestAmount(100000, 16, 8, 24);
    	System.out.println("Interest Amount is = "+intrAmt);
    	
    	//Close Container
    	ctx.close();
    }
}
