package com.learning.spring.test;

public class ConsoleWriter implements LogWriter {

	public void write(String text) {
		
		System.out.println("Console Log writer: " + text);

	}

}
