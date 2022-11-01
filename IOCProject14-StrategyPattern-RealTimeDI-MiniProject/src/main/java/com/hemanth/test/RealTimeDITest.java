package com.hemanth.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.hemanth.controller.MainController;
import com.hemanth.vo.CustomerVO;

public class RealTimeDITest {

	public static void main(String[] args) {
		// Read Inputs from end user
		
		Scanner sc = new Scanner(System.in);
		String name = null,addrs=null,pamt=null,time=null,rate=null;
		
		if(sc!=null) {
			System.out.println("Enter Customer name :: ");
			name=sc.next();
			System.out.println("Enter Customer address :: ");
			addrs = sc.next();
			System.out.println("Enter Customer principal amount :: ");
			pamt = sc.next();
			System.out.println("Enter rate of interest :: ");
			rate = sc.next();
			System.out.println("Enter time in months :: ");
			time = sc.next();
			
		}
		
		// Prepare VO Class having inputs
		CustomerVO vo = new CustomerVO();
		vo.setCname(name);vo.setCadd(addrs);vo.setPamt(pamt);
		vo.setRate(rate);vo.setTime(time);
		
		// create IOC Container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/hemanth/cfgs/applicationContext.xml");
		
		
		//get Controller Class obj
		MainController controller = factory.getBean("controller", MainController.class);
		try {
			// invoke the business method
			String resultMessage = controller.processCustomer(vo);
			System.out.println(resultMessage);
		} catch (Exception e) {
			System.out.println("Problem in Customer registration :: "+e.getMessage());
			e.printStackTrace();
		}
		
	}

}
