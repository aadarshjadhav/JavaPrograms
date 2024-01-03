package com.finaltestpractices;
/*
 * Q15. Class Numbers contains int nums[10] . It also contains method addNumber( int num) to 
 * add number in nums[]. This method throws DuplicateValueException if num value is already 
 * there in nums[].WAP to demonstrate throw, throws, finally, 2 catch blocks , 
	customException (DuplicateValueException) in Number Class.	
 * */

public class Numbers {
	
	public static void addNumber(int digit, int num[]) throws DuplicateValueException
	{
		for(int i=0;i<num.length;i++)
		{
			if(num[i]==digit)
			{
				throw new DuplicateValueException("digit already exists", digit);
			}
			else
			{
			}
		}
	}

	public static void main(String[] args) {
		int num[]=new int[10];
		num[0]=12;
		num[1]=11;
		num[2]=15;
		num[3]=16;
		num[4]=14;
		
		try
		{
			addNumber(14,num);
		}
		catch(DuplicateValueException e)
		{
			System.out.println("DuplicateValueException in Catch"+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception Occurred:"+e);
		}
		finally
		{
			System.out.println("In Finally Block");
		}
		
	}

}
