package com.learning.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		
		//Using property tag
		ApplicationContext context = new ClassPathXmlApplicationContext("com/learning/spring/beans/bean.xml");

		Person person = (Person) context.getBean("person");

		System.out.println(person);

		((ClassPathXmlApplicationContext) context).close();
		
		//Using P name space
		ApplicationContext context1 = new ClassPathXmlApplicationContext("com/learning/spring/beans/bean.xml");

		Person person1 = (Person) context1.getBean("person2");

		System.out.println(person1);

		((ClassPathXmlApplicationContext) context1).close();
		

	}

}
