package com.hemanth.test;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hemanth.beans.CricketBat;
import com.hemanth.beans.Cricketer;

public class LookupMethodInjectionTest 
{
    public static void main( String[] args )
    {
        //Create IOC Container
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/hemanth/cfgs/applicationContext.xml");
    	
    	//get Target class Object
       Cricketer cktr = ctx.getBean("cktr", Cricketer.class);
       System.out.println(cktr.getClass()+"   "+cktr.getClass().getSuperclass());
       System.out.println(Arrays.toString(cktr.getClass().getDeclaredMethods()));
       
       // Invoke the business Method
       
       cktr.batting();
       cktr.bowling();
       cktr.fielding();
       cktr.wicketKeeping();
    }
}
