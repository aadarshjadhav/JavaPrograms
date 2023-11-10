package com.arraydemos;
/*Array Of Objects Extra Assignment : 
	Supplier class Contains supid,supName and array of itemsSUpplied.
	Item class contains itemId,ItemName,itemCost.  
		1.Create 2 Item type arrays with size 5 and associate them with two Supplier objects. 
		2. Show item details supplied by each supplier.
*/
import java.util.Scanner;

public class Suplier {
	
	int supid;
	String supname;
	Item itemsuplied;
	
	//Constructor
	public Suplier()
	{
		supid=0;
		supname="";
		itemsuplied=new Item();	
	}
	
	//SETTERS METHOD
	public void setSupId(int supid)
	{
		this.supid=supid;
	}
	
	public void setSupName(String supname)
	{
		this.supname=supname;
	}
	
	public void setItem(Item itemsuplied)
	{
		this.itemsuplied=itemsuplied;
	}
	
	
	//GETTERS METHOD
	public int getSupId()
	{
		return supid;
	}
	
	public String getSupName()
	{
		return supname;
	}
	
	public Item getItem()
	{
		return itemsuplied;
	}
	
	public String toString()
	{
		return " Suplier ID:"+ supid+" Suplier Name:"+ supname+ " Item :"+ itemsuplied;
	}
	
	//Main Method
	public static void main(String args[])
	{
		Suplier sup[]= new Suplier[2];
		
		Item[] itemsuplied= new Item[5];
		
		System.out.println("Enter the Details for items");
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			itemsuplied[i]= new Item();
			System.out.println("Enter the Item"+(i+1)+" id, name and cost:");
			itemsuplied[i].setItemId(sc.nextInt());
			itemsuplied[i].setItemName(sc.next());
			itemsuplied[i].setItemCost(sc.nextInt());
		}
		
		System.out.println("Enter the Suplier Details:");
		for(int i=0; i<2;i++)
		{
			System.out.println("Enter the Id and Name for Suplier No:"+ (i+1));
			sup[i]= new Suplier();
			sup[i].setSupId(sc.nextInt());
			sup[i].setSupName(sc.next());
			sup[i].setItem(itemsuplied[i]);
		}
		
		System.out.println(" Display 2 supliers:");
		for(int i=0;i<2;i++)
		{
			System.out.println(sup[i]);
		}
	}
}
