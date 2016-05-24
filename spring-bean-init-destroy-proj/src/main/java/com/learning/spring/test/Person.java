package com.learning.spring.test;

public class Person {

	private int id;
	private String name;

	private int taxId;
	private String address;
	
	private WorkLog workLog;
	
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

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
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
