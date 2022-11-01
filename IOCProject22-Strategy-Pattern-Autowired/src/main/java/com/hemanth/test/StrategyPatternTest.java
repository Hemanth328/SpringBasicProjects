// Client Application
package com.hemanth.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.hemanth.factory.FlipkartFactory;
import com.hemanth.sbeans.Flipkart;

public class StrategyPatternTest {

	public static void main(String[] args) {
		
		// Creating the IOC Container
		
		/*
		 * DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		 * XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		 * reader.loadBeanDefinitions("com/hemanth/config/applicationContext.xml");
		 * 
		 * We get this error when we invoke this and this is cause of spring container did not detect the Autowired Injection (in Flipkart class)
		 * 
		 * Cannot invoke "com.hemanth.comps.Courier.deliver(int)" because "this.courier" is null
		 * 
		 * so to avoid this error we use ApplicationContextConatiner
		 */
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/hemanth/config/applicationContext.xml");
		
		//get Target Class
		
		Flipkart fpkt = ctx.getBean("fpkt", Flipkart.class);
		// In general fpkt was the bean id given but now we have taken out the bean id so by default fully qualified class name will be the bean id
		//Invoking Business Method
		
		String message = fpkt.shopping(new String[] {"Shirt", "Jean", "Blazzer"}, new double[] {2160.0, 3500.0, 6900.0});
		
		System.out.println(message);
		
		
		
		
	}
}
