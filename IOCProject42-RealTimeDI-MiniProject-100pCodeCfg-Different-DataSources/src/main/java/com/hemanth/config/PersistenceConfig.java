package com.hemanth.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "com.hemanth.dao")
@PropertySource(value = "com/hemanth/commons/jdbc.properties")
public class PersistenceConfig {
	
	@Autowired
	private Environment env;
	
	/*
	 * @Bean(name="dmds") public DriverManagerDataSource createDMDS() {
	 * 
	 * DriverManagerDataSource dmds = new DriverManagerDataSource();
	 * dmds.setDriverClassName(env.getRequiredProperty("jdbc.driver"));
	 * dmds.setUrl(env.getRequiredProperty("jdbc.url"));
	 * dmds.setUsername(env.getRequiredProperty("jdbc.username"));
	 * dmds.setPassword(env.getRequiredProperty("jdbc.password"));
	 * 
	 * return dmds; }
	 */
	
	/*
	 * @Bean(name="dbcp2DS") public DataSource createApacheDBCP2DS() {
	 * BasicDataSource bds = new BasicDataSource();
	 * bds.setDriverClassName(env.getRequiredProperty("jdbc.driver"));
	 * bds.setUrl(env.getRequiredProperty("jdbc.url"));
	 * bds.setUsername(env.getRequiredProperty("jdbc.username"));
	 * bds.setPassword(env.getRequiredProperty("jdbc.password"));
	 * bds.setMinIdle(10); // Initial Connection objects in the connection pool
	 * bds.setMaxTotal(100); // Max connections in the jdbc connection pool
	 * bds.setMaxWaitMillis(30000); // Max wait time in MilliSeconds to get avail
	 * the jdbc connection object return bds; }
	 */

	@Bean(name="hkcpDS")
	public DataSource createHKCPDS() {
		HikariDataSource hkds = new HikariDataSource();
		hkds.setDriverClassName(env.getRequiredProperty("jdbc.driver"));
		hkds.setJdbcUrl(env.getRequiredProperty("jdbc.url"));
		hkds.setUsername(env.getRequiredProperty("jdbc.username"));
		hkds.setPassword(env.getRequiredProperty("jdbc.password"));
		hkds.setMinimumIdle(10);
		hkds.setMaximumPoolSize(100);
		hkds.setConnectionTimeout(30000);
		
		return hkds;
	}
}
