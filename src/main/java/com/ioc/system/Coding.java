package com.ioc.system;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("coding")
@Order(2)
public class Coding implements Task {
	{
		System.out.println("Coding initialized");
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
			System.out.println("Coding task executed");
	}

}
