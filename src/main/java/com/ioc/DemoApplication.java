package com.ioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ioc.system.Junction;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(DemoApplication.class, args);
       Junction junction = (Junction) ac.getBean("junction");
       junction.executeTask();
		
		/*	
		System.out.println("Application started successfully!");
		System.out.println("Bean count: " + ac.getBeanDefinitionCount());

		Function videoPlayer = (Function) ac.getBean("video");
		Function videoPlayer1 = (Function) ac.getBean("video");
		Function videoPlayer2 = (Function) ac.getBean("video");
		videoPlayer.activity();
		System.out.println("===================================");
		System.out.println("Hashcode of video player1: " + videoPlayer.hashCode());
		System.out.println("Hashcode of video player2: " + videoPlayer1.hashCode());
		System.out.println("Hashcode of video player3: " + videoPlayer2.hashCode());

		System.out.println("====================================");
		Function audioPlayer = (Function) ac.getBean("audio");
		Function audioPlayer1 = (Function) ac.getBean("audio");
		Function audioPlayer2 = (Function) ac.getBean("audio");
		audioPlayer.activity();
		System.out.println("Hashcode of audio player1: " + audioPlayer.hashCode());
		System.out.println("Hashcode of audio player2: " + audioPlayer1.hashCode());
		System.out.println("Hashcode of audio player3: " + audioPlayer2.hashCode());*/
	}

}
