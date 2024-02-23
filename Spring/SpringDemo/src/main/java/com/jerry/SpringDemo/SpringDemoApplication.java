package com.jerry.SpringDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		System.out.print("Up");
		SpringApplication.run(SpringDemoApplication.class, args);
	}

}
