package com.app.runner;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;

public class TestRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("from runner");
		System.out.println(args);
		System.out.println(Arrays.asList(args));
	}

}
