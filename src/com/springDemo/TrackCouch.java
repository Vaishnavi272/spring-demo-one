package com.springDemo;

public class TrackCouch implements Coach {
	
	private FortuneService fortuneService;
		
	

	public TrackCouch(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
	  return "Run a hard";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	
	
	// add init method 
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: this is init method");
	}
	// destory method
	
	public void doMyStartupYoYo() {
		System.out.println("TrackCoach: this is destory method");
	}
}
