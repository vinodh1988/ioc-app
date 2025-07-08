package com.ioc.system;

import org.springframework.beans.factory.annotation.Autowired;

public class Junction {
    @Autowired
    Task task; // the matching implementation of Task will be injected by Spring

    
    public void executeTask() {
		task.execute();
	}
}
