package com.learnspring.seconddemo;

import org.springframework.stereotype.Component;

//@Component("thatSillyCoach") Removing to apply default Bean ID

@Component
public class CricketCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice OffSide Batting";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
