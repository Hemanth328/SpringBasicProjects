package com.hemanth.test;

import java.util.Locale;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hemanth.config.AppConfig;

public class SpringI18nTest 
{
    public static void main( String[] args )
    {
    	// Create ApplicationContext Container
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        
        //Get messages from properties file according to the locale we submit
        Locale locale = new Locale(args[0], args[1]);
        String msg1 = ctx.getMessage("wish.msg", new String[] {}, locale);
        String msg2 = ctx.getMessage("bid.msg", new String[] {}, locale);
        
        System.out.println(msg1+" "+msg2);

    }
}
