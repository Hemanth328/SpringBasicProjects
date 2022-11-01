package com.hemanth.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hemanth.config.AppConfig;
import com.hemanth.sbeans.WIshMessageGenerator;

public class JavaConfigAppTest {
	
    public static void main( String[] args ){
        
    	//Create IOC Container
    	AnnotationConfigApplicationContext ctx = new 
    			AnnotationConfigApplicationContext(AppConfig.class);
    	// Get Target SpringBean Class Object
    	WIshMessageGenerator generator = ctx.getBean("wmg", WIshMessageGenerator.class);
    	
    	String username = generator.generateWishMessage("Hemanth Kumar");
    	
    	System.out.println(username);
    	
    	ctx.close();
    }
}
