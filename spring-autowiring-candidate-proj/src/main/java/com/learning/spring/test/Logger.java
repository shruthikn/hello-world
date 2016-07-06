package com.learning.spring.test;

public class Logger {
	
	private LogWriter consoleWriter;
	private LogWriter fileWriter;
	
	public void setConsoleWriter(LogWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}
	
	
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
