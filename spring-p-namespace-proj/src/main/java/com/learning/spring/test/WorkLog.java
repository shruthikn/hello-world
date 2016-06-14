package com.learning.spring.test;

public class WorkLog {
	private String activity;
	private int durationInHours;
	private int workLogId;
	
	public void setWorkLogId(int workLogId) {
		this.workLogId = workLogId;
	}

	public WorkLog(String activity, int durationInHours) {
		this.activity = activity;
		this.durationInHours = durationInHours;
	}

	@Override
	public String toString() {
		return "WorkLog [activity=" + activity + ", durationInHours=" + durationInHours + ", workLogId=" + workLogId
				+ "]";
	}

}
