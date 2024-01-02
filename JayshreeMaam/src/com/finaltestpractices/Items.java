package com.finaltestpractices;

public class Items {
	
	String item_name;
	int item_id;
	
	public Items(String item_name, int item_id) {
		super();
		this.item_name = item_name;
		this.item_id = item_id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	@Override
	public String toString() {
		return "Items [item_name=" + item_name + ", item_id=" + item_id + "]";
	}
	
	
	

}
