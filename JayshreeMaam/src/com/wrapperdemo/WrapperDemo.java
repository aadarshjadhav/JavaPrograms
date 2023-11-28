package com.wrapperdemo;

public class WrapperDemo {
	
	public static void main(String args[])
	{
		Integer iobj= new Integer(12);
		int i=iobj.intValue();
		//int i=iobj; //doubt: both line 8 and 9 performs the same operation
		System.out.println(i);
		
		
		String is=String.valueOf(i);
		System.out.println(is);
		
		char ch=(char)i;
		char a=Character.valueOf(ch);
		System.out.println("Character a:"+a);
		
		int val=I
		
//		if(i==is)  //Error:incompatible operand types, int and String
//			System.out.println(true);
		
				
		int num= Integer.parseInt(is);
		if(i==num)
		{
			System.out.println("Both i and num are of same type!"+" i:"+i+" num:"+num);
		}
		
		String str="123";
		int sti=Integer.valueOf(str);
		int its=123;
		
		if(its==sti) //Both sti and its belongs to same type int
		{
			
		}
	}

}
