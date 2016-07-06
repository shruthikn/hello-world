package com.learning.spring.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Logger {
	
	private ConsoleWriter consoleWriter;
	private LogWriter fileWriter;
	
	@Autowired
	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}
	
	@Autowired
	public void setFileWriter(LogWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	public void writeToConsole(String text) {
		consoleWriter.write(text);
	}
	
	public void writeToFile(String text) {
		fileWriter.write(text);
	}
	
}
