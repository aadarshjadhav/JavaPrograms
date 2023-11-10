package com.arraydemos;

public class Item {
	int itemid, itemcost;
	String itemname;
	
	public Item()
	{
		itemid=0;
		itemcost=0;
		itemname="";
	}
	
	public Item(int itemid, String itemname, int itemcost)
	{
		this.itemid=itemid;
		this.itemcost=itemcost;
		this.itemname=itemname;
	}
	
	public void setItemId(int itemid)
	{
		this.itemid=itemid;
	}
	
	public void setItemCost(int itemcost)
	{
		this.itemcost=itemcost;
	}
	
	public void setItemName(String itemname)
	{
		this.itemname=itemname;
	}
	
	public int getItemId()
	{
		return this.itemid;
	}
	
	public int getItemCost()
	{
		return this.itemcost;
	}
	
	public String getItemName()
	{
		return this.itemname;
	}
	
	public String toString()
	{
		return " Item ID:"+ itemid+" Item Name:"+ itemname+ " Item Cost:"+itemcost;
	}
}
