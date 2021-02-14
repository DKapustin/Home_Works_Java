package com.NC.demo;

import org.springframework.context.annotation.ComponentScan;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.NC.controllers")
@ComponentScan(basePackages = "com.NC")
@SpringBootApplication
public class UserApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}
//	@Override
//	protected final SpringApplicationBuilder configure(final SpringApplicationBuilder applicationBuilder) {
//		return applicationBuilder.sources(UserApplication.class);
//	}

}
