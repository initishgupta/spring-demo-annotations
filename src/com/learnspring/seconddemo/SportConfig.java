package com.learnspring.seconddemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("come.learnspring.seconddemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
// define bean for out sad fortune service
	
@Bean
public FortuneService sadFortuneService(){
	return new SadFortuneService();
}
	
	
//define bean for our swim coach and inject dependency

@Bean
public Coach swimCoach(){
	return new SwimCoach(sadFortuneService());
}

}
