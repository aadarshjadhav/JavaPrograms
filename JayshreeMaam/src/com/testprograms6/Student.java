package com.testprograms6;

import java.util.Objects;

public class Student {
	
	int id;
	String name;
	String degree; 
	int passingYear;
	boolean placed;
	
	public Student(int id, String name, String degree, int passingYear, boolean placed) {
		super();
		this.id = id;
		this.name = name;
		this.degree = degree;
		this.passingYear = passingYear;
		this.placed = placed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public int getPassingYear() {
		return passingYear;
	}

	public void setPassingYear(int passingYear) {
		this.passingYear = passingYear;
	}

	public boolean isPlaced() {
		return placed;
	}

	public void setPlaced(boolean placed) {
		this.placed = placed;
	}

	@Override
	public int hashCode() {
		return Objects.hash(degree, id, name, passingYear, placed);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(degree, other.degree) && id == other.id && Objects.equals(name, other.name)
				&& passingYear == other.passingYear && placed == other.placed;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", degree=" + degree + ", passingYear=" + passingYear
				+ ", placed=" + placed + "]";
	} 
	
	

}
