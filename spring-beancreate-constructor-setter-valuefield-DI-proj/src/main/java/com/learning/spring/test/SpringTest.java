package com.learning.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {

		// calling method #1

		ApplicationContext context = new FileSystemXmlApplicationContext(
				"src/main/java/com/learning/spring/beans/bean.xml");

		Person person = (Person) context.getBean("person");
		person.speak();

		((FileSystemXmlApplicationContext) context).close();

		// Calling method #2

		ApplicationContext context1 = new ClassPathXmlApplicationContext(
				"com/learning/spring/beans/bean.xml");

		Person person1 = (Person) context1.getBean("person");
		person1.speak();

		//Adding Constructor arguments to the bean
		
		System.out.println(person1.printString());
		
		//Using the setter method in the bean
		
		System.out.println(person1.printString2());
		
		//using value tag
		
		System.out.println(person1.printString3());
		
		//Dependency injection example
		
		System.out.println(person1);
		
		((ClassPathXmlApplicationContext) context1).close();

	}

}
