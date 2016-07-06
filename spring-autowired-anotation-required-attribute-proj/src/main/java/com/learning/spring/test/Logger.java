package com.learning.spring.test;

import org.springframework.beans.factory.annotation.Autowired;

public class Logger {

	private ConsoleWriter consoleWriter;
	private FileWriter fileWriter;

	@Autowired(required = false)
	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}

	@Autowired
	public void setFileWriter(FileWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	public void writeToConsole(String text) {
		if (consoleWriter != null)
			consoleWriter.write(text);
		else
			System.out.println("ConsoleWriter object is null as the bean definition is not present in bean.xml file\n"
					+ "and required attribute of @Autowired annotation is false.");
	}

	public void writeToFile(String text) {
		fileWriter.write(text);
	}

}
