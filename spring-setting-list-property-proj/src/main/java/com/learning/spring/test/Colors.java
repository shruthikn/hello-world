package com.learning.spring.test;

import java.util.List;

public class Colors {
	
	private List<String> colors;
	
	public void setColors(List<String> names) {
		this.colors = names;
	}

	@Override
	public String toString() {
		return "Colors [colors=" + colors + "]";
	}
	
	

}
