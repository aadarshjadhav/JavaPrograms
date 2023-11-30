package com.mockprograms;

public class AccessendingWordLen {
	
	
	
	public void ascendingEachWord(String str)
	{
		String str_array[]=str.split(" ");
	
		for(int i=0;i<str_array.length;i++)
		{	
			for(int j=0;j<str_array.length;j++)
			{
				if(str_array[j].length()>str_array[i].length())
				{
					String temp= str_array[i];
					str_array[i]=str_array[j];
					str_array[j]=temp;
				}
			}
			
		}
		
		for(int i=0;i<str_array.length;i++)
		{
			System.out.println(str_array[i]);
		}
		
	}
	
	public static void main(String agrs[])
	{
		String str="java is object oriented language its easy to learn";
		AccessendingWordLen obj= new AccessendingWordLen();
		
		obj.ascendingEachWord(str);
	//	char str_array[]=str.split(str);
		
		
		
	}

}
