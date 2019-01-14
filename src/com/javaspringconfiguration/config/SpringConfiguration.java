package com.javaspringconfiguration.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.javaspringconfiguration.config")
@PropertySource("classpath:mylogger.properties")

public class SpringConfiguration {

	@Bean
	public Fortune randomFortune() {

		return new RandomFortune();
	}

	@Bean
	public Coach swimmingCoach() {
		SwimmingCoach swimmingCoach = new SwimmingCoach(randomFortune());
		return swimmingCoach;
	}
	
	
}
