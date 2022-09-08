package com.springDemo;

public  class BaseBallCouch implements Coach {
	
	private FortuneService fortuneService;
	
	public void BaseBallCoach(FortuneService thefortuneService) {
		fortuneService= thefortuneService;
	}
	public String getDailyWorkout() {
		return " spend 30 minutes";
	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return  fortuneService.getFortune();
	}

}
