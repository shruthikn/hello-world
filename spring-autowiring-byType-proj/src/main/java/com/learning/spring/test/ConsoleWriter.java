package com.learning.spring.test;

public class ConsoleWriter implements LogWriter {

	public void write() {
		
		System.out.println("Console Log writer: Hello world!");

	}

}
