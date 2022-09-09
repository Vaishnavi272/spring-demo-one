package com.springDemo;

public class CricketCoach implements Coach {
	
	
	private Object fortuneService;
	
	
	private String emailAddress;
	private String team;

	//no-arguments constructor
	public CricketCoach() {
	 System.out.println("this is no arguments constructor");	
	}
    
	
	// setter method
	
	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		System.out.println("this is setter method for set emailAddress");
		this.emailAddress = emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("this is setter method for set team");
		this.team = team;
	}


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
