package com.groupid13.springdemo;

public class BasBallCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return ("Spend 1hr in batting practise ");
	}
	public void MyInitializeMethod() {
		System.out.println("Inside the initialize method");
	}
	public void MyDestroyMethod() {
		System.out.println("Inside the destroy method");
	}

}
