package com.testprograms2;

public class SumOfHavles {
	
	public SumOfHavles()
	{
		
	}
	
	public int countDigit(int num)
	{
		int count=0;
		while(num!=0)
		{
			num/=10;
			count++;
		}
		return count;
	}
	
	public int checkSumHavles(int num, int digits)
	{
		int base1=0;
		int base2=0;
		int last_havles_digit;
		int other_havles_digit;
		int sum_of_two_havles;
		int base1_reverse=0;
		
		for(int i=0; i<=digits;i++)
		{
			if(i<digits/2)
			{
				last_havles_digit= num%10;
				base1= (base1*10)+last_havles_digit;
			}
			else
			{
				other_havles_digit= num%10;
				base2=(base2*10) + other_havles_digit;
			}
			
			num/=10;
		}
		
		System.out.println("Base1:"+base1 +" Base2:"+base2);
		
		System.out.println("Reversing arrangement of Base1:"+ base1);
		for(int j=0; j<digits/2; j++)
		{
			if(j<digits/2)
			{
				last_havles_digit= base1%10;
				base1_reverse= (base1_reverse*10)+last_havles_digit;
			}
			base1/=10;
		}
		
		System.out.println("Base1_Reverse:"+ base1_reverse);
		sum_of_two_havles= base1_reverse+base2;
		sum_of_two_havles= sum_of_two_havles*sum_of_two_havles;
		System.out.println("Sum_of_two_havles:" + sum_of_two_havles);
		return sum_of_two_havles;
	}
	
	public static void main(String args[]) 
	{
		SumOfHavles soh= new SumOfHavles();
		int num=3025;
		int digits;
		int temp;
		
		digits=soh.countDigit(num);
		
		temp= soh.checkSumHavles(num, digits);
		
		if(num==temp)
		{
			System.out.println("Yes they match:"+" Num:"+num +" Temp:"+temp);
		}
		else
		{
			System.out.println("They dont match");
		}
	}
}
