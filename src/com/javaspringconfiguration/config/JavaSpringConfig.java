package com.javaspringconfiguration.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaSpringConfig {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyLoggerConfig.class,
				SpringConfiguration.class);

		Coach coach = context.getBean("swimmingCoach", Coach.class);
		/*
		 * Coach coachq1 = context.getBean("swimmingCoach", Coach.class);
		 * 
		 * boolean result = (coach == coachq1); System.out.println("Result is " +
		 * result); System.out.println("My coach address is " + coach);
		 * System.out.println("My coach1 address is " + coachq1);
		 */
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getDailyWorkoutPlan());

		context.close();
	}

}
