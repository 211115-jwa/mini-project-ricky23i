package com.doge;

public class Character {
	String name;
	String species;
	String toast;
	String description;
	int age;
	
	
	@Override
	public String toString() {
		String c= "Name: "+this.name+ " Species: "+this.species+" Toast: "+ this.toast+ " Age: "+this.age+" Description: "+this.description; 
		return c;
	}

}
