package com.springDemo;

public class CricketCoach implements Coach {
	
	
	private Object fortuneService;

	//no-arguments constructor
	public CricketCoach() {
	 System.out.println("this is no arguments constructor");	
	}
    
	
	// setter method
	
	public void setFortuneService(FortuneService frotuneService) {
		System.out.println("this is setter method");
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice for fast bowling";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "do work hard";
	}

}
