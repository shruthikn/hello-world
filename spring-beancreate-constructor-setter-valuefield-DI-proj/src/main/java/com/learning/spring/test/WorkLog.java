package com.learning.spring.test;

public class WorkLog {
	private String activity;
	private int durationInHours;
	
	public WorkLog(String activity, int durationInHours) {
		this.activity = activity;
		this.durationInHours = durationInHours;
	}

	@Override
	public String toString() {
		return "WorkLog [activity=" + activity + ", durationInHours=" + durationInHours + "]";
	}
	
}
