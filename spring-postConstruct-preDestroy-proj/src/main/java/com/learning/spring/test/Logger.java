package com.learning.spring.test;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Logger {
	
	private ConsoleWriter consoleWriter;
	private LogWriter fileWriter;
	
	@Resource
	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}
	
	@Resource(name="filebean")
	public void setFileWriter(LogWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	public void writeToConsole(String text) {
		consoleWriter.write(text);
	}
	
	public void writeToFile(String text) {
		fileWriter.write(text);
	}
	
	@PostConstruct
	public void inti() {
		System.out.println("Init method called!");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy method called");
	}

}
