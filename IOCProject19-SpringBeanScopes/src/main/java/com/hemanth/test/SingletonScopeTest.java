// Client Application
package com.hemanth.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.hemanth.comps.Flipkart;
import com.hemanth.factory.FlipkartFactory;
import com.hemanth.singleton.Printer;

public class SingletonScopeTest {

	public static void main(String[] args) {
		
		// Creating the IOC Container
		
		/*
		 * FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(
		 * "src/main/java/com/hemanth/cfgs/applicationContext.xml");
		 */
		
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/hemanth/config/applicationContext.xml");
		
		//get Target Class
		
		Flipkart fpkt = ctx.getBean("fpkt", Flipkart.class);
		
		
		// singleton scope
		Flipkart fpkt1 = ctx.getBean("fpkt", Flipkart.class);  
		System.out.println(fpkt.hashCode()+"  "+fpkt1.hashCode());
		System.out.println("fpkt==fpkt1? "+(fpkt==fpkt1));
		System.out.println("========================================================");
		System.out.println("");
		System.out.println("");
		
		
		/*
		 * What happens if we configure real singleton java classes as spring bean with
		 * prototype scope
		 */
		
		
		  Printer p1 = ctx.getBean("p1", Printer.class); Printer p2 =
				  ctx.getBean("p2", Printer.class);
		  System.out.println(p1.hashCode()+"   "+p2.hashCode());
		 
		
		//Invoking Business Method
		
		String message = fpkt.shopping(new String[] {"Shirt", "Jean", "Blazzer"}, new double[] {2160.0, 3500.0, 6900.0});
		
		System.out.println(message);
		
	}
}
