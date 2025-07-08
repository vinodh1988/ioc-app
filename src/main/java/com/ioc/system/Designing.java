package com.ioc.system;

import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("designing")
@Primary
@Order(1) // This will ensure Designing is the primary bean if multiple beans of type Task exist
public class Designing implements Task {
	
	{
		System.out.println("Designing initialized");
	}
	
	@Override
	public void execute() {
		System.out.println("Designing task executed");
	}

}
