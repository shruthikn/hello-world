package com.learning.spring.test;

public class Company {

	private String name;
	private String place;

	public void setName(String name) {
		this.name = name;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public void init() {
		System.out.println("Company bean created - " + this);
	}

	public void destroy() {
		System.out.println("Company bean destroyed - " + this);
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", place=" + place + "]";
	}

}
