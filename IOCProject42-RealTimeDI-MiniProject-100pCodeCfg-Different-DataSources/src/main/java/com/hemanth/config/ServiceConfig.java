package com.hemanth.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.hemanth.service")
@ImportResource(locations = "com/hemanth/cfgs/applicationContext.xml")
@PropertySource(value = {"com/hemanth/commons/jdbc.properties"})
public class ServiceConfig {

}
