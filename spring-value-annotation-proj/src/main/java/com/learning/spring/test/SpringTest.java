package com.learning.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/learning/spring/beans/bean.xml");
		
		Robot robot = (Robot) context.getBean("robot");
		
		robot.speak();
		
		((ClassPathXmlApplicationContext) context).close();
		
	}

}
