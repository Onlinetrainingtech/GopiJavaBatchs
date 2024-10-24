package com.xyz.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		BaseballCoach b1=new BaseballCoach();
		TrackCoach b2=new TrackCoach();
		
		System.out.println("BaseballCoach::"+b1.getDailWorkout());
		System.out.println("TrackCoach::"+b1.getDailWorkout());

	}

}
