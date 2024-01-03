package com.finaltestpractices;

import java.io.Serializable;

public class Items  implements Serializable{
	
	String item_name;
	int item_id;
	
	public Items(int item_id, String item_name) {
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
	
	@Override
	public int hashCode()
	{
		return item_id;
	}

	@Override
	public boolean equals(Object obj)
	{
		Items d= (Items) obj;
		if(this.item_id==d.item_id && this.item_name==d.item_name)
			return true;
		else
			return false;
	}
	
  
	

}
