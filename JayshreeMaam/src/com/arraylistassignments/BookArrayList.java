package com.arraylistassignments;

import java.util.ArrayList;

public class BookArrayList {
	
	public static void main(String args[])
	{
		ArrayList<Book> book_list= new ArrayList<>();
		
		//ArrayList<Integer> L1= new ArrayList<>();
		book_list.add(new Book(1,"Ghost","Henry",500));
		book_list.add(new Book(2,"Ghost2","Henry",500));
		book_list.add(new Book(3,"Ghost3","Henry",500));
		book_list.add(new Book(4,"Vampire","Jeniffer",500));
		book_list.add(new Book(5,"Vampire","Jeniffer",500));
		book_list.add(new Book(6,"Vampire","Jeniffer",500));
		book_list.add(new Book(7,"Vampire","Jeniffer",500));
		
		for(int i=0;i<book_list.size();i++)
		{
			int count=0;
			for(int j=0;j<book_list.size();j++)
			{
				
				if(book_list.get(i).authorName.equals(book_list.get(j).authorName) && j<i)
					break;
				else if(book_list.get(i).authorName.equals(book_list.get(j).authorName))
				{
					count++;
				}
			}
			
			if(count>0)
				System.out.println(book_list.get(i).authorName+" has :"+count);
		}
	}
	

}
