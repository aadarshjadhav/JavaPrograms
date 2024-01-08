package com.finaltestpractices.nov_batch_version_2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
/* 
 *Q7. There is a HashMap<Item, supplierID>  which contains information of Items  and  
 *supplier ID of supplier who provides that Item. supplierID is integer  and Item is class type. 
 *Item  class can have fields of your choice. Create another hashmap which contains supplierID  as key 
 *and list of Items supplied by that supplier as value.					[2]
Q8.  Create array of Item class objects (You may refer Item class created in above question) . 
	All item objects should be stored to file, only duplicate item objects should be written only once. 
	Use try with resources (ARM) technique to write this code. 	 

 *
 */
public class SupplyItemHashmap {
	


	public static void main(String[] args) throws IOException {
		
		HashMap<Integer,ArrayList<Items>> hashmap= new HashMap<>();
		
		ArrayList<Items> list1= new ArrayList<>();
		list1.add(new Items(101,"Pen"));
		list1.add(new Items(102,"Pencil"));
		list1.add(new Items(103,"Rubber"));
	
		hashmap.put(1, list1);
		
		ArrayList<Items> list2= new ArrayList<>();
		list2.add(new Items(104,"Notebook"));
		list2.add(new Items(105,"BigNotebook"));
		list2.add(new Items(106,"MediumNotebook"));
		list2.add(new Items(106,"MediumNotebook"));
		hashmap.put(2, list2);
		
		//Creating new ArrayList 
		ArrayList<Items> unique_list= new ArrayList<>();
		
		Set<Entry<Integer, ArrayList<Items>>> entries=hashmap.entrySet();
		Iterator<Entry<Integer, ArrayList<Items>>> itr_entries=entries.iterator();
		
		while(itr_entries.hasNext())
		{
			
			Entry<Integer, ArrayList<Items>> single_element=itr_entries.next();
			System.out.println("SuplierID:"+single_element.getKey());
			System.out.println("SuplierID:"+single_element.getValue());
			
			ArrayList<Items> list_items= new ArrayList<Items>();
			Iterator<Items> itr_list_items=single_element.getValue().iterator();
			while(itr_list_items.hasNext())
			{
				System.out.println("Inside while loop");
				Items item=itr_list_items.next();
				if(unique_list.contains(item))
				{
					
				}
				else
				{
					unique_list.add(item);
					
				}
			}
			
		}
		
	
		Iterator<Items> itr_unique_list_items=unique_list.iterator();
		while(itr_unique_list_items.hasNext())
		{
			System.out.println("inside arraylist");
			System.out.println(itr_unique_list_items.next());
		}
		
		
		
		// Working out Filehandling
		
		FileOutputStream fout=null; 
		
		fout = new FileOutputStream("D:\\ThinkQuotient\\eclipse-workspace\\gitworkspace\\JayshreeMaam\\src\\com\\finaltestpractices\\Items.txt");
		
		try (ObjectOutputStream outputStream = new ObjectOutputStream(fout))
		{
		    outputStream.writeObject(unique_list);
		    System.out.println("ArrayList written to file successfully.");
		} 
		catch (IOException e) 
		{
		    e.printStackTrace();
		}
		

	}

}
