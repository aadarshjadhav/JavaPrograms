package com.finaltestpractices.nov_batch_version_2;

import java.util.Scanner;
// Q2. Input any number. Find the sum of the digits of the number using a recursive function.

public class DigitsRecursiveFuntion {
	
	public static void findSumDigits(int num,int sum)
	{
	
		if(num!=0)
		{
			sum+=num%10;
			num/=10;
			findSumDigits(num,sum);
		}
		else
			System.out.println("Sum:"+sum);
	}
	
	public static void main(String args[])
	{
		System.out.println("Enter theh Digits:");
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		int sum=0;
		findSumDigits(num,sum);
	}

}
