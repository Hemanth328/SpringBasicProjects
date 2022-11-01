package com.hemanth.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.hemanth.beans.A;

public class CircularInjectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathResource res = new ClassPathResource("com/hemanth/cfgs/applicationContext.xml");
		
		XmlBeanFactory factory = new XmlBeanFactory(res);
		
		A a1 = (A)factory.getBean("a1");
		
		System.out.println(a1);
	}

}
