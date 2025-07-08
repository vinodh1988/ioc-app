package com.ioc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ioc.system.AudioPlayer;
import com.ioc.system.Function;
import com.ioc.system.Integrator;
import com.ioc.system.Junction;
import com.ioc.system.VideoPlayer;

@Configuration
public class CentralConfig {
	{
		System.out.println("CentralConfig initialized");
	}

	@Bean("video")
	//@Scope("prototype") // Ensures a new instance is created each time
	public Function video() {
		return new VideoPlayer();
	}
	
	@Bean("audio")
	//@Scope("prototype") // Ensures a new instance is created each time
	public Function audio() {
		return new AudioPlayer();
	}
	
	@Bean("junction")
	public Junction junction() {
		return new Junction();
	}
	
	@Bean("integrate")
	public Integrator integrator() {
		return new Integrator();
	}
	
}
