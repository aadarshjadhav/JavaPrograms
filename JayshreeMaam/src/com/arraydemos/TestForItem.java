package com.arraydemos;

import java.util.Arrays;
import java.util.Scanner;

/*Array Of Objects Assignments : 
Item class contains itemId,ItemName,itemCost.
   1.Create Array of Item with size 5 and display it.     
   2. Show itemNames with cost more than Rs.2000      
   3. Show item details with higest price.      
   4. Show average price of all items.       
   5. Increase the itemPrice by 200 whose itemPrice is below Rs.1000 
 * */

public class TestForItem {
	
	Item t;
	
	
	public TestForItem()
	{
		t= new Item();
		
	}
	
	public static void highestItemprice(Item t[])
	{
		
		Item highest_item_price=t[0];
		for(int i=0;i<t.length;i++)
		{
			
			if(t[i].getItemCost()>highest_item_price.getItemCost())
			{
				highest_item_price=t[i];
			}
		}
		System.out.println("Item that has highetprice:"+highest_item_price);
	}
	
	public static void morethan2000Cost(Item t[])
	{
		System.out.println("Item that cost more than 2000:");
		for(int i=0;i<t.length;i++)
		{
			if(t[i].getItemCost()>2000)
			{
				System.out.println(t[i]);
			}
		}
		
	}
	
	public static void averagePrice(Item t[])
	{
		double sum=0,avg=0;
		for(int i=0;i<t.length;i++)
		{
			sum+=t[i].getItemCost();
		}
		avg=sum/t.length;
		System.out.println("Average price is:"+ avg);
	}
	
	public static void increaseItemCost(Item t[])
	{
		for(int i=0;i<t.length;i++)
		{
			if(t[i].getItemCost()<1000)
			{
				t[i].setItemCost((t[i].getItemCost()+200));
			}
		}
	}
	
	public String toString()
	{
		return " Item:"+t;
	}
	
	public static void main(String args[])
	{
		Item t[]= new Item[3];
		
		System.out.println("Enter the details for 5 Items:");
		Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the ID,Cost and Name for Item N0:"+(i+1));
			t[i]= new Item();
			t[i].setItemId(sc.nextInt());
			t[i].setItemCost(sc.nextInt());
			t[i].setItemName(sc.next());
			
		}
		
		
		System.out.println(Arrays.toString(t));
		//Finding highest item cost
		highestItemprice(t);
		
		//Finding items that cost more that 2000
		morethan2000Cost(t);
		
		//Show average price of all items
		averagePrice(t);
		
		//Increase item cost by 2000 whose cost is less than 1000
		increaseItemCost(t);
		System.out.println(Arrays.toString(t));
		
	}
	

}
