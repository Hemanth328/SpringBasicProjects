package com.hemanth.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hemanth.beans.VotingEligibilityCheckingService;

public class BeanLifeCycleTest {

	public static void main(String[] args) {
		// create container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/hemanth/cfgs/applicationContext.xml");
		
		
		// get spring bean obj reference
		VotingEligibilityCheckingService service = ctx.getBean("voting", VotingEligibilityCheckingService.class);
		
		//Invoke the business method
		String result = service.checkVotingEligibility();
		System.out.println(result);
		
		
		// Closing the container
		ctx.close();
	}

}
