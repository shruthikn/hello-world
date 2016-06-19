package com.learning.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/learning/spring/beans/bean.xml");

		Colors c = (Colors) context.getBean("colorsBean");
		Colors c1 = (Colors) context.getBean("colorsBean1");
		
		System.out.println("List values for bean property\n" + c);
		
		System.out.println("Set values for bean property\n" + c1);

		((ClassPathXmlApplicationContext) context).close();
	}

}
