package com.learning.spring.test;

public class Person {

	private int id;
	private String name;

	private int taxId;
	private String address;
	
	private WorkLog workLog;

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
	
	public String printString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	public String printString2() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + "]";
	}

	public String printString3() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", address=" + address + "]";
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", address=" + address + ", workLog="
				+ workLog + "]";
	}

}
