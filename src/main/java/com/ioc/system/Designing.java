package com.ioc.system;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("designing")
@Primary
public class Designing implements Task {
	
	{
		System.out.println("Designing initialized");
	}
	
	@Override
	public void execute() {
		System.out.println("Designing task executed");
	}

}
