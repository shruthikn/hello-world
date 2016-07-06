package com.learning.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/learning/spring/beans/bean.xml");

		Logger logger = (Logger) context.getBean("logger");

		logger.writeToConsole("Hello World!");
		logger.writeToFile("Hi there!");

		((ClassPathXmlApplicationContext) context).close();

	}

}
