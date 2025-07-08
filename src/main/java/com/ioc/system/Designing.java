package com.ioc.system;

import org.springframework.stereotype.Component;

@Component
public class Designing implements Task {
	
	{
		System.out.println("Designing initialized");
	}
	
	@Override
	public void execute() {
		System.out.println("Designing task executed");
	}

}
