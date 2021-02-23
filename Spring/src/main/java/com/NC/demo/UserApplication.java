package com.NC.demo;

import org.springframework.context.annotation.ComponentScan;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@ComponentScan("com.NC.controllers")
@ComponentScan(basePackages = "com.NC")
@SpringBootApplication
public class UserApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}
}
