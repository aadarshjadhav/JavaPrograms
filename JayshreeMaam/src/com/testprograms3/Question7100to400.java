package com.testprograms3;

public class Question7100to400 {
	
	public static void main(String args[])
	{
		boolean status;
		
		int digit;
		int count=1;
		
		for(int i=100;i<=400;i++)
		{
			int j=i;
			count=0;
			while(j!=0)
			{
				digit=j%10;
				if(j%2==0 && digit!=0)
				{
					count++;
				}
				else
				{
					break;
				}
				j=j/10;
			}
			
			if(count==3)
			{
				System.out.println(i);
			}
		}
	}
	
	

}
