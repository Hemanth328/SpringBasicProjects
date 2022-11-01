// Client Application
package com.hemanth.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.hemanth.comps.Flipkart;
import com.hemanth.factory.FlipkartFactory;

public class StrategyPatternTest {

	public static void main(String[] args) {
		
		// Creating the IOC Container
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/hemanth/config/applicationContext.xml");
		
		//get Target Class
		
		Flipkart fpkt = factory.getBean("fpkt", Flipkart.class);
		//Invoking Business Method
		
		String message = fpkt.shopping(new String[] {"Shirt", "Jean", "Blazzer"}, new double[] {2160.0, 3500.0, 6900.0});
		
		System.out.println(message);
		
		
		
		
	}
}
