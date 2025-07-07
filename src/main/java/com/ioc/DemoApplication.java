package com.ioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ioc.system.Function;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(DemoApplication.class, args);
	
		System.out.println("Application started successfully!");
		System.out.println("Bean count: " + ac.getBeanDefinitionCount());
	
		Function videoPlayer = (Function) ac.getBean("video");
		videoPlayer.activity();

		Function audioPlayer = (Function) ac.getBean("audio");
		audioPlayer.activity();
	}

}
