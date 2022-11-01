package com.hemanth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
@ComponentScan(basePackages = "com.hemanth")
public class AppConfig {
	
	
	@Bean(name="messageSource")
	public ResourceBundleMessageSource createRBMS() {
		System.out.println("AppConfig.createRBMS()");
		ResourceBundleMessageSource source = new ResourceBundleMessageSource();
		source.setBasename("com/hemanth/commons/App");
		return source;
	}

}
