package com.paltaie.head2head.springcorner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import common.PrimeService;
import common.PrimeServiceImpl;

@Configuration
public class Config {
	@Bean
	public PrimeService primeService() { 
		return new PrimeServiceImpl();
	}
}
