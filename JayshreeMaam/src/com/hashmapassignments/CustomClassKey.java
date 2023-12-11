package com.hashmapassignments;

import java.util.Objects;

public class CustomClassKey {
	int id;
	String name;
	
	public CustomClassKey(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	
	@Override
	public String toString() {
		return "CustomClassKey [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomClassKey other = (CustomClassKey) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	

}
