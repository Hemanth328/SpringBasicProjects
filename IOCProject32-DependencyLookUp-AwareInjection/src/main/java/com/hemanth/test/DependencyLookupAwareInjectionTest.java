package com.hemanth.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hemanth.beans.CricketBat;
import com.hemanth.beans.Cricketer;

public class DependencyLookupAwareInjectionTest 
{
    public static void main( String[] args )
    {
        //Create IOC Container
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/hemanth/cfgs/applicationContext.xml");
    	
    	//get Target class Object
       Cricketer cktr = ctx.getBean("cktr", Cricketer.class);
       
       // Invoke the business Method
       
       cktr.batting();
       cktr.bowling();
       cktr.fielding();
       cktr.wicketKeeping();
    }
}
