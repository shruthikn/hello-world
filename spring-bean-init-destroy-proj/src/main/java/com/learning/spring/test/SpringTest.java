package com.learning.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/learning/spring/beans/bean.xml");

		Person person1 = (Person) context.getBean("person");
		Person person2 = (Person) context.getBean("person");

		person1.speak();
		person2.speak();

		person1.setTaxId(333);

		System.out.println(person1);
		System.out.println(person2);

		Company company = (Company) context.getBean("company");
		System.out.println(company);

		((ClassPathXmlApplicationContext) context).close();

	}

}
