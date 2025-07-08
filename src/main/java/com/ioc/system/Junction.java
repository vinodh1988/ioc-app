package com.ioc.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Junction {
    @Autowired
    //@Qualifier("coding") // or "designing" based on the desired implementation
    //Task designing; // the matching implementation of Task will be injected by Spring
     Task task;
    
    public void executeTask() {
		task.execute();
	}
}
