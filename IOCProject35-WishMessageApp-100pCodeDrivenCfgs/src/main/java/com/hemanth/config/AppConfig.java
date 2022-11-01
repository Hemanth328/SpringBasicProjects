package com.hemanth.config;

import java.time.LocalDateTime;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.hemanth")  // Alternate to <context:component-scan>
public class AppConfig {
	
	public AppConfig() {
		System.out.println("AppConfig : 0-Param Constructor");
	}
	
	@Bean(name="dt")  // Bean(value="dt") or @Bean("dt")
	public LocalDateTime createLocalDateTime() {
		System.out.println("AppConfig.createLocalDateTime()");
		return LocalDateTime.now();
	}

}
