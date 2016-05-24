package com.learning.spring.test;

public class Person {

	private int id;
	private String name;

	private int taxId;
	private String address;
	
	private WorkLog workLog;
	
	public Person() {
		System.out.println("No argument constructor");
	}
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public static Person createPerson(int id, String name) {
		System.out.println("Creating Person bean using factory method with constructor arguments");
		return new Person(id, name);
	}
	
	public static Person createPersonDefault() {
		System.out.println("Creating Person bean using factory method with no constructor arguments");
		return new Person(444, "Bob");
	}
	
	public void onCreate() {
		System.out.println("Person Bean Created - " + this);
	}
	
	public void onDestroy() {
		System.out.println("Person Bean destroyed - " + this);
	}

	public void setWorkLog(WorkLog workLog) {
		this.workLog = workLog;
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void speak() {
		System.out.println("Hi. I am a person.");
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", address=" + address + ", workLog="
				+ workLog + "]";
	}

}
