package com.groupid13.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class MySpringIocApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(MySpringIocApplication.class, args);
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Coach theCoach = context.getBean("MyCoach",Coach.class);
		/*Coach alphaCoach = context.getBean("MyCoach",Coach.class);
		boolean result = (theCoach == alphaCoach);
		System.out.println("Pointing to the same object ="+result);
		System.out.println("Location of theCoach ="+theCoach);
		System.out.println("Location of alphaCoach ="+alphaCoach);*/
		System.out.println(theCoach.getDailyWorkout());
		 context.close();
	}

}
