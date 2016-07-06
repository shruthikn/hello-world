package com.learning.spring.test;

import org.springframework.beans.factory.annotation.Autowired;

public class Logger {
	
	@Autowired
	private ConsoleWriter consoleWriter;
	
	@Autowired
	private FileWriter fileWriter;
	
	public void writeToConsole(String text) {
		consoleWriter.write(text);
	}
	
	public void writeToFile(String text) {
		fileWriter.write(text);
	}

}
