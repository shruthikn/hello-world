package com.learning.spring.test;

import javax.inject.Inject;
import javax.inject.Named;

public class Logger {
	
	private ConsoleWriter consoleWriter;
	private LogWriter fileWriter;
	
	@Inject
	@Named(value = "consolebean2")
	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}
	
	@Inject
	@Named(value = "filebean")
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
