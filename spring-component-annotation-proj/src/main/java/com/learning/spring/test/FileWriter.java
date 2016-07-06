package com.learning.spring.test;

import org.springframework.stereotype.Component;

@Component
public class FileWriter implements LogWriter {

	public void write(String text) {
		
		System.out.println("File log writer: " + text);
	}

}
