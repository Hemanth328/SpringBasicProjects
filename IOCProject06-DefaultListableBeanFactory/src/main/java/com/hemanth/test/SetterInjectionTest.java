package com.hemanth.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.hemanth.beans.WishMessageGenerator;

public class SetterInjectionTest {
	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		
		reader.loadBeanDefinitions("com/hemanth/cfgs/applicationContext.xml");
		
		System.out.println("-----------------Conatiner Created------------------");
		
		WishMessageGenerator generator = factory.getBean("wmg", WishMessageGenerator.class);
		
		System.out.println("-----------------Getting target class object------------------");
		
		// Invoking the business method
		
		String result = generator.generateWishMessage("Hemanth Kumar");
		System.out.println("Wish Meassage is : "+result);
		
	}

}
