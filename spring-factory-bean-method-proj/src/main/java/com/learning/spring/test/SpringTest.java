package com.learning.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		
		//Using factory method with constructor arguments

		ApplicationContext context = new ClassPathXmlApplicationContext("com/learning/spring/beans/bean.xml");

		Person person1 = (Person) context.getBean("person");
		person1.speak();
		System.out.println(person1);
		
		//Using factory bean

		Company company = (Company) context.getBean("company");
		System.out.println(company);

		((ClassPathXmlApplicationContext) context).close();
		
		//Using factory method with no argument constructor.

		ApplicationContext context1 = new ClassPathXmlApplicationContext("com/learning/spring/beans/bean.xml");

		Person person2 = (Person) context1.getBean("person2");
		person2.speak();
		System.out.println(person2);

		((ClassPathXmlApplicationContext) context1).close();

	}

}
