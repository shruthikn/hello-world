package com.learning.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {

		// default-autowire property is used

		ApplicationContext context1 = new ClassPathXmlApplicationContext("com/learning/spring/beans/bean1.xml");

		Logger logger1 = (Logger) context1.getBean("logger");

		logger1.writeToConsole("Hello World!");
		logger1.writeToFile("Hi there!");
		System.out.println("============================================================================");

		((ClassPathXmlApplicationContext) context1).close();

		// default-autowire and
		// default-autowire-candidates="ConsoleWriter,FileWriter" is used

		ApplicationContext context2 = new ClassPathXmlApplicationContext("com/learning/spring/beans/bean2.xml");

		Logger logger2 = (Logger) context2.getBean("logger");

		logger2.writeToConsole("Hello World!");
		logger2.writeToFile("Hi there!");
		System.out.println("============================================================================");

		((ClassPathXmlApplicationContext) context2).close();

		// default-autowire and
		// default-autowire-candidates="*Writer" is used

		ApplicationContext context3 = new ClassPathXmlApplicationContext("com/learning/spring/beans/bean3.xml");

		Logger logger3 = (Logger) context3.getBean("logger");

		logger3.writeToConsole("Hello World!");
		logger3.writeToFile("Hi there!");
		System.out.println("============================================================================");

		((ClassPathXmlApplicationContext) context3).close();

	}

}
