package com.learning.spring.test;

public class FileWriter implements LogWriter {

	public void write(String text) {
		
		System.out.println("File log writer: " + text);
	}

}
