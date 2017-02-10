package com.learnspring.seconddemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach") Removing to apply default Bean ID

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	// define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	//define my init method
	@PostConstruct
	public void doMyStartUpStuff(){
		System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
		
	}
	
	
	// define my destroy method
	
	@PreDestroy
	public void doMyCleanUpStuff(){
		System.out.println(">> TennisCoach: inside of doMyCleanStuff()");
		
	}
	
	
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//	fortuneService = theFortuneService;
//	}
	
	
	//define a setter method
	/*@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService)
	{
		System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");
		this.fortuneService = fortuneService;
	}*/
	

	@Override
	public String getDailyWorkout() {
		return "Pracice your backhand volley";
	}

	@Override
	public String getDailyFortune() {	
		return fortuneService.getFortune();
	}

}
