package com.learning.spring.test;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("qualifyFileWriter")
public class FileWriter implements LogWriter {

	public void write(String text) {
		
		System.out.println("File log writer: " + text);
	}

}
