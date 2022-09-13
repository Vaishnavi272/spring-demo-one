package com.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore")
public class JavaConfig {
	@Bean
	public Name getName() {
		return new Name();
	}
	
	@Bean
	public Student getStudent() {
		
		Student student = new Student();
		return student;
	}

}
