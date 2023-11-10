package com.testprograms3;

public class Question6AlternateEvenOdd {
	
	public static void main(String args[])
	{
		int array[]= {1,5,9,7,3,6,8,13,2,4};
		
		int count_even=1;
		int count_odd=1;
		
		//counting even and odd elements
		for(int i=0;i<array.length;i++)
		{
			if(array[i]%2==0)
			{
				count_even++;
			}
			else
			{
				count_odd++;
			}
		}
		
		//Seperating the single array into 2 seprat
		
		
		//Adding alternativ elements in array.
		int alter_array[]= new int[count_even+count_odd];
		int count_array;
		int max=0;
		
		if(count_even>count_odd)
		{
			max=count_even;
		}
		else
		{
			max=count_odd;
		}
		
		for(int i=0;i<max;i++)
		{
			if(i<count_even)
			{
				alter_array[count]=
			}
			if(i<count_odd)
			{
				
			}
		}
	}

}
