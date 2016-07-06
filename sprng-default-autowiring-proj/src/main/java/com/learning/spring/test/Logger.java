package com.learning.spring.test;

public class Logger {
	
	private ConsoleWriter consoleWriter;
	private FileWriter fileWriter;
	
	
	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}
	
	
	public void setFileWriter(FileWriter fileWriter) {
		this.fileWriter = fileWriter;
	}
	
	public void writeToConsole(String text) {
		consoleWriter.write(text);
	}
	
	public void writeToFile(String text) {
		fileWriter.write(text);
	}

}
