package com.stringassignments;

import java.util.Arrays;

//String create with new operator and without new

public class Question1 {
	
	public static void main(String args[])
	{
		//Without new keyword
		String name="Aadarsh";
		System.out.println(name);
		
		String name1="Aadarsh";
		
		//With new keyword
		String name2= new String("Aadarsh");
		System.out.println(name2);
		
		//Question 2//Comparing two String without new keyword
		if(name==name2)
		{
			System.out.println("Name and name 2 point to same location");
		}
		else
		{
			System.out.println("Name and name 2 dont point to same location");
		}
		
		//3.Compare string using new operator when new is present see different reference is there.
		
		String name3= new String("Aadarsh");
		String name4= new String("Aadarsh");
		if(name3==name4)
		{
			System.out.println("Name 3 and name4 have same reference!");
		}
		else
		{
			System.out.println("Name 3 and name4 are not same!");
			
		}
		
		if(name1==name)
		{
			System.out.println("Name and name1 have same reference!");
		}
		else
		{
			System.out.println("Name and name1 have different reference!");
		}
		
		
		//4.  What is String constant pool and Heap? Explain?
		
		
		//5.  Write a Java program to find length of a string.
		char[] charArray = name.toCharArray(); // Converts the string to a character array
		System.out.println(charArray.length);
		
		//6. Write a Java program to concatenate two strings.
		char[] namearray = name.toCharArray(); 
		char[] name1array = name.toCharArray();
		
		char[] nameandname1= new char[namearray.length+name1array.length];
		int count=0;
		for(int i=0;i<nameandname1.length;i++)
		{
			
			if(i>=namearray.length)
			{
				nameandname1[i]=name1array[count];
				count++;
				continue;
				
			}
			nameandname1[i]=namearray[i];
		}
		
		System.out.println(Arrays.toString(nameandname1));
		
		//7.Write a Java program to compare two strings.
		//String name5 and name6
		String name5="Rohit";
		String name6="Rohit";
		char arrayname5[]= name5.toCharArray();  
		char arrayname6[]= name6.toCharArray();
		
		boolean status=false;
		for(int i=0;i<arrayname5.length;i++)
		{
			if(arrayname5[i]==arrayname6[i])
			{
				status=true;
			}
			else 
			{
				System.out.println("Name5 anad name6 are not same");
				break;
			}
		}

		if(status==true)
		{
			System.out.println("Name5 and name6 are same!");
		}
		
		//8. Write a Java program to convert lowercase string to uppercase.
		String s=name5.toUpperCase();
		System.out.println(s);
		
		String name7= "prem";
		char arrayname7[]= name7.toCharArray();
		
		for(int i=0;i<arrayname7.length;i++)
		{
			if(arrayname7[i]>='a' && arrayname7[i]<='z')
					arrayname7[i]=(char)(arrayname7[i]-32);
		}
		System.out.println(Arrays.toString(arrayname7));
		
		
		//9.Write a Java program to copy one string to another string.
		String name8= "Jitu";
		
		char arrayname8[]= name8.toCharArray();
	//	Character arrayname9[]= new Character[arrayname8.length];
		char arrayname9[]= new char[arrayname8.length];
		
		for(int i=0;i<arrayname8.length;i++)
		{
			arrayname9[i]=arrayname8[i];
		}
		
	//	String name9=arrayname9.toString();
		
		String name9=new String(arrayname9);
		System.out.println("name9:"+name9);
		
	//	10.WAP to split string into 2 tokens where string is “HELLO$WORLD”
	// 	Three ways to do this
		//First Method
		String sh="Hello$World";
		String sh1[]=sh.split("\\$", 2);
		for(int i=0;i<sh1.length;i++)
		{
			System.out.println(sh1[i]);
		}
		
		//Second Method
		String sh2=sh.substring(0, 5);
		System.out.println(sh2);
		
		String sh3=sh.substring(6,sh.length());
		System.out.println(sh3);
		
		//Third Method
		char ch4[]=sh.toCharArray();
		int array_length=0;
		char first_half[];
		char second_half[];
		count=0;
		for(int i=0;i<ch4.length;i++)
		{
			
			if(ch4[i]=='$')
			{
				first_half= new char[count];
				second_half= new char[ch4.length-count];	
			}
			else
			{
				count++;
			}
			
		}
		System.out.println(count+ "$$$"+ ch4.length);
		
		
		//11.Write a Java program to find first occurrence of a character in a given string.
		
		String str= "Hello$World";
		System.out.println(str.indexOf("l"));
		
		//Logic through
		char c[]= str.toCharArray();
		
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='l')
			{
				System.out.println("first occurrence of l is:"+ i);
				break;
			}
		}
		
		
		
		
	}

}
