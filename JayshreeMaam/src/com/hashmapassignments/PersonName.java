package com.hashmapassignments;

public class PersonName {

	String name;

	
	public PersonName(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PersonName [name=" + name + "]";
	}
	
}
