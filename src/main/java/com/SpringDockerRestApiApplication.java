package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDockerRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerRestApiApplication.class, args);
		System.out.println("Spring boot is rumnning");
	}

}
