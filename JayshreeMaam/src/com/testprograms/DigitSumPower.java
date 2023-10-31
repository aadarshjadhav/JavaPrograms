package com.testprograms;
public class DigitSumPower {
	
	public int countDigits(int n)
	{
		int count=0;
		
		do 
		{	n/=10;
			count++;
		}while(n!=0);
		
		return count;
	}
	
	public static void main(String args[]) {
	
	int num=345;
	int power=0;
	int base=0;
	int sum=0;
	DigitSumPower dsp= new DigitSumPower();
	
	power=dsp.countDigits(num);
	int basecal=1;
	while(num!=0)
	{
		base=num%10 ;
		for(int i=power; i>=1;i--)
		{
			basecal*=base;	
		}
		power--;
		sum+=basecal;
		basecal=1;
		num/=10;
	}
	
	System.out.println(sum);
	
	}

}
