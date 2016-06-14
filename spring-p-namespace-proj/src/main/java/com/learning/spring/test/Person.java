package com.learning.spring.test;

public class Person {

	private int id;
	private String name;

	private String taxId;
	private String address;
	
	private WorkLog workLog;
	
	public void setWorkLog(WorkLog workLog) {
		this.workLog = workLog;
	}

	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public Person() {
		
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", address=" + address + ", workLog="
				+ workLog + "]";
	}

}
