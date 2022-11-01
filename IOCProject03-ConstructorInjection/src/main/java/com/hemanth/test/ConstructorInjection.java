package com.hemanth.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.hemanth.beans.Student;
import com.hemanth.beans.WishMessageGenerator;

public class ConstructorInjection {
	public static void main(String[] args) {
		
		//Hold the name and location of spring bean cfg file in Resource Object
		//FileSystemResource res = new FileSystemResource("src/main/java/com/hemanth/cfgs/applicationContext.xml");
		//ClassPathResource res = new ClassPathResource("com/hemanth/cfgs/applicationContext.xml");
		ClassPathResource res = new ClassPathResource("applicationContext.xml");
		
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
		
		Student stud = (Student)factory.getBean("st");
		System.out.println("Student obj data :: "+stud);
		
	}

}
