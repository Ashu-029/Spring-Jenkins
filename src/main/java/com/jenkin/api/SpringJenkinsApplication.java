package com.jenkin.api;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {

	
	private static final Logger log = LoggerFactory.getLogger(SpringJenkinsApplication.class);

	@PostConstruct
	public void init() {
		
		log.info(" Application Has Started sucessully for new instance......... ");
		
	}
	
	public static void main(String[] args) {
		
		log.info(" Application Has Started......... ");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	    
	}

}
