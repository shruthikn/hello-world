package com.learning.spring.test;

import java.util.Map;

public class Jungle {

	private Animal largest;
	Map<String,Animal> animals;
	Map<String, String> foods;

	public void setFoods(Map<String, String> foods) {
		this.foods = foods;
	}

	public void setLargest(Animal largest) {
		this.largest = largest;
	}

	public void setAnimals(Map<String, Animal> animals) {
		this.animals = animals;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();

		sb.append("Largest animal is: " + largest + "\n\n");
		sb.append("List of all animals:\n");

		for(Map.Entry<String, Animal> entry: animals.entrySet()) {
			sb.append(entry.getKey() + ": " + entry.getValue() + "\n");
		}
		sb.append("\n");

		sb.append("Animals and their foods:\n");

		for(Map.Entry<String, String> entry: foods.entrySet()) {
			sb.append(entry.getKey() + ": " + entry.getValue() + "\n");
		}
		return sb.toString();
	}

}
