package com.springDemo;

public interface FortuneService {
	
	public default String getFortune() {
	   return "this is your lucky day";
   }
}
