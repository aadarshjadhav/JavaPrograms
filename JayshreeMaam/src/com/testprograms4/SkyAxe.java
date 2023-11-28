package com.testprograms4;

public class SkyAxe {
	
	public static void main(String args[])
	{
		
		String word="IIIMIT";
		String str="THE SKY IS THE LIMIT";
		
		char str_array[]= str.toCharArray();
		char word_array[]=word.toCharArray();
		
		int count=0;
		for(int i=0;i<word_array.length;i++)
		{
			for(int j=0;j<str_array.length;j++)
			{
				if(word_array[i]==str_array[j])
				{
					count++;
					break;
				}
			}
		}
		System.out.println(count);
		
		if(count==word_array.length)
		{
			System.out.println("Yes, the word can be formed from given strinng");
		}
	}

}
