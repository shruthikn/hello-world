package com.learning.spring.test;

import org.springframework.stereotype.Component;

@Component
public class ConsoleWriter implements LogWriter {

	public void write(String text) {
		
		System.out.println("Console Log writer: " + text);

	}

}
