package com.hemanth.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.hemanth.beans.WishMessageGenerator;

public class SetterInjectionTest {
	public static void main(String[] args) {
		
		//Hold the name and location of spring bean cfg file in Resource Object
		FileSystemResource res = new FileSystemResource("src/main/java/com/hemanth/cfgs/applicationContext.xml");
		
		//create a BeanFactory of spring container (Inversion of Control(IOC) container)
		
		XmlBeanFactory factory = new XmlBeanFactory(res);
		System.out.println("-----------------Conatiner Created------------------");
		
		// get target spring bean class obj injected with dependent spring bean class obj
		
		Object obj = factory.getBean("wmg");
		
		// type Casting
		
		WishMessageGenerator generator = (WishMessageGenerator)obj;
		
		System.out.println("-----------------Getting target class object------------------");
		
		// Invoking the business method
		
		String result = generator.generateWishMessage("Hemanth Kumar");
		System.out.println("Wish Meassage is : "+result);
		
	}

}
