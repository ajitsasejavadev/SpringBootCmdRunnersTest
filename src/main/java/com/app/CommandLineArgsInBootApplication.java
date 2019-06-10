package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommandLineArgsInBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommandLineArgsInBootApplication.class, args);
	}

}
