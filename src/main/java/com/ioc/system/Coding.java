package com.ioc.system;

import org.springframework.stereotype.Component;

@Component("coding")
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
