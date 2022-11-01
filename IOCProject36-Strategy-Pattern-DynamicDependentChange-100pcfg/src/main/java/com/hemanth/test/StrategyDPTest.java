// Client Application
package com.hemanth.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.hemanth.config.AppConfig;
import com.hemanth.factory.FlipkartFactory;
import com.hemanth.sbeans.Flipkart;

public class StrategyDPTest {

	public static void main(String[] args) {

		// Creating the IOC Container


		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		

		// get Target Class

		
		  Flipkart fpkt = ctx.getBean("fpkt", Flipkart.class); // In general fpkt was
		  
				  
		  String message = fpkt.shopping(new String[] {"Shirt", "Jean", "Blazzer"}, new
		  double[] {2160.0, 3500.0, 6900.0});
		  
		  System.out.println(message);
		 

	}
}
