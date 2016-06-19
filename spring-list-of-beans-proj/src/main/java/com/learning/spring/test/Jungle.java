package com.learning.spring.test;

import java.util.List;

public class Jungle {
	
	private Animal largest;
	List<Animal> animals;
	
	public void setLargest(Animal largest) {
		this.largest = largest;
	}
	
	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Largest animal is: " + largest + "\n");
		sb.append("List of all animals:\n");
		
		for(Animal animal: animals) {
			sb.append(animal);
			sb.append("\n");
		}
		return sb.toString();
	}
	
}
