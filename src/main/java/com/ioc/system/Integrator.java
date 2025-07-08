package com.ioc.system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Integrator {
@Autowired
private List<Task> tasks;//it automatically injects all beans of type Task

public void executeAllTasks() {
	for (Task task : tasks) {
		task.execute();
	}
}
}
