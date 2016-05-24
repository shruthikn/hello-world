package com.learning.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/learning/spring/beans/bean.xml");

		Person person1 = (Person) context.getBean("person");
		Person person2 = (Person) context.getBean("person");
		
		person1.speak();
		person2.speak();
		
		//Scope of the bean is prototype
		person1.setTaxId(333);
		
		System.out.println(person1);
		System.out.println(person2);
		
		//Scope of the bean is singleton
		
		WorkLog workLog1 = (WorkLog) context.getBean("worklog");
		WorkLog workLog2 = (WorkLog) context.getBean("worklog");
		
		workLog1.setWorkLogId(999);
		
		System.out.println(workLog1);
		System.out.println(workLog2);
		
		((ClassPathXmlApplicationContext) context).close();

	}

}
