// Client Application
package com.hemanth.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.hemanth.comps.Flipkart;
import com.hemanth.factory.FlipkartFactory;
import com.hemanth.singleton.Printer;

public class SingletonScopeTest {

	public static void main(String[] args) {
		
		// Creating the IOC Container
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/hemanth/config/applicationContext.xml");
		
		//get Target Class
		
		Flipkart fpkt = factory.getBean("fpkt", Flipkart.class);
		
		
		// singleton scope
		Flipkart fpkt1 = factory.getBean("fpkt", Flipkart.class);  
		System.out.println(fpkt.hashCode()+"  "+fpkt1.hashCode());
		System.out.println("fpkt==fpkt1? "+(fpkt==fpkt1));
		System.out.println("========================================================");
		System.out.println("");
		System.out.println("");
		
		
		/*
		 * What happens if we configure real singleton java classes as spring bean with
		 * prototype scope
		 */
		
		
		  Printer p1 = factory.getBean("p1", Printer.class); Printer p2 =
		  factory.getBean("p2", Printer.class);
		  System.out.println(p1.hashCode()+"   "+p2.hashCode());
		 
		
		//Invoking Business Method
		
		String message = fpkt.shopping(new String[] {"Shirt", "Jean", "Blazzer"}, new double[] {2160.0, 3500.0, 6900.0});
		
		System.out.println(message);
		
	}
}
