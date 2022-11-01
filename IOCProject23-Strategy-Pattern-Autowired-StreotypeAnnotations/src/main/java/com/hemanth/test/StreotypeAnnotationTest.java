// Client Application
package com.hemanth.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.hemanth.factory.FlipkartFactory;
import com.hemanth.sbeans.Flipkart;

public class StreotypeAnnotationTest {

	public static void main(String[] args) {

		// Creating the IOC Container


		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/hemanth/config/applicationContext.xml");

		// get Target Class

		
		  Flipkart fpkt = ctx.getBean("fpkt", Flipkart.class); // In general fpkt was
		  
			/*
			 * the bean id given but now we have taken out the bean id so by default fully
			 * qualified class name will be the bean id //Invoking Business Method
			 */		  
		  String message = fpkt.shopping(new String[] {"Shirt", "Jean", "Blazzer"}, new
		  double[] {2160.0, 3500.0, 6900.0});
		  
		  System.out.println(message);
		 

	}
}
