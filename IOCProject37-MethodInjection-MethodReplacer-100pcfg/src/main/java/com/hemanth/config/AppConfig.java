package com.hemanth.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "com.hemanth")
@ImportResource(locations = "com/hemanth/cfgs/applicationContext.xml")
public class AppConfig {

}
