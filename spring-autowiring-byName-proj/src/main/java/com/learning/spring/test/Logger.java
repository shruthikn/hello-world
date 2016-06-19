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
	
	public void writeToConsole() {
		consoleWriter.write();
	}
	
	public void writeToFile() {
		fileWriter.write();
	}

}
