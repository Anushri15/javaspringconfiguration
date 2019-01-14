/**
 * 
 */
package com.javaspringconfiguration.config;

import java.util.Random;

import org.springframework.stereotype.Component;

/**
 * @author anushrinayak
 *
 */
@Component
public class RandomFortune implements Fortune {

	private String  fortuneArray[] = {"Today is your lucky day",
									  "Beaware of wolfs in sheep's clothing",
									  "Deligence is mother of success"};
	Random randomFortune = new Random();
	
	@Override
	public String getDailyFortune() {
		int index = randomFortune.nextInt(fortuneArray.length);
		return fortuneArray[index];
	}

}
