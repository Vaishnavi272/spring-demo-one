package com.springcore;

import org.springframework.stereotype.Component;

@Component("firststudent")
public class Student {
	
	private Name name;
	
	public Student() {
		super();
		this.name = name;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public void study() {
		this.name.display();
	
       System.out.println("do study hard");
	}

}
