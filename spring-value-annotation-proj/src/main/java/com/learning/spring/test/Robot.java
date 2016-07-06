package com.learning.spring.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Robot {

	private int id = 0;
	private String speach = "Hello!";

	@Autowired
	public void setId(@Value("1234") int id) {
		this.id = id;
	}

	@Autowired
	public void setSpeach(@Value("Hi! I am a Robot.") String speach) {
		this.speach = speach;
	}

	public void speak() {
		System.out.println(id + ": " + speach);
	}

}
