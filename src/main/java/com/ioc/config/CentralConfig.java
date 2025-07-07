package com.ioc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ioc.system.AudioPlayer;
import com.ioc.system.Function;
import com.ioc.system.VideoPlayer;

@Configuration
public class CentralConfig {
	{
		System.out.println("CentralConfig initialized");
	}

	@Bean("video")
	public Function video() {
		return new VideoPlayer();
	}
	
	@Bean("audio")
	public Function audio() {
		return new AudioPlayer();
	}
}
