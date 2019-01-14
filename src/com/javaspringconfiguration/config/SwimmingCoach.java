package com.javaspringconfiguration.config;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;


@Scope("singleton")
//@PropertySource("classpath:config/config.properties")
//@PropertySource("classpath:sport.properties")
public class SwimmingCoach implements Coach {

	@Value("${mycoach.email}")
	private String email;
	@Value("${mycoach.team}")
	private String team;
	private Fortune fortune;

	public SwimmingCoach(@Qualifier("randomFortune") Fortune fortune) {
		this.fortune = fortune;
	}

	@PostConstruct
	public void callMe() {
		System.out.println("Hey Call me after you call the constructor");
	}

	@Override
	public String getDailyWorkoutPlan() {

		return "swim daily for 2 hours" + "Oh my team name " + team;
	}

	@Override
	public String getDailyFortune() {

		return fortune.getDailyFortune() + "Oh My Couach Id " + email;
	}

	@PreDestroy
	public void callMeBeforeYouDestroy() {
		System.out.println("Hey Call me after you call the constructor");
	}

}
