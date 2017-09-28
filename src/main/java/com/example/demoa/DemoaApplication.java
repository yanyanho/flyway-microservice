package com.example.demoa;

import javafx.application.Application;
import org.flywaydb.core.Flyway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import javax.sql.DataSource;

@EnableAutoConfiguration
@SpringBootApplication
//@EnableEurekaClient
public class DemoaApplication {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

//	@Autowired
//	private  DataSource dataSource;

	public static void main(String[] args) {
//		Flyway flyway = new Flyway();
//
//		// Point it to the database
//		flyway.setDataSource(dataSource);
//		//flyway.setInitOnMigrate(true);
//
//		// Start the migration
//		flyway.migrate();

		SpringApplication.run(DemoaApplication.class, args);
	}

//	public  void migration() {
//		// Create the Flyway instance
//		Flyway flyway = new Flyway();
//
//		// Point it to the database
//		flyway.setDataSource(dataSource);
//		//flyway.setInitOnMigrate(true);
//
//		// Start the migration
//		flyway.migrate();
//	}

}

