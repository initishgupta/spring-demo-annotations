package com.learnspring.seconddemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		//read the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//get the bean from spring
		Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		//closing the bean
		context.close();
	}

}
