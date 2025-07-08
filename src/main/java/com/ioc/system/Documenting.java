package com.ioc.system;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("documenting")
@Order(3) // This will ensure Documenting is executed after Designing and Coding
public class Documenting implements Task {

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Documenting task executed");
	}

}
