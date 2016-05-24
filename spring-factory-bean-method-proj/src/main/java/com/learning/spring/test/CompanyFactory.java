package com.learning.spring.test;

public class CompanyFactory {
	
	public Company createCompany() {
		System.out.println("Creating Company bean using factory bean");
		return new Company();
	}

}
