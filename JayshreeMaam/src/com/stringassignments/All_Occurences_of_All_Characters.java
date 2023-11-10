package com.stringassignments;

public class All_Occurences_of_All_Characters {
	
	public static void main(String args[])
	{
		//Finding all occurrences in a string
		String str2="There is a monster";
		char strarray2[]=str2.toCharArray();
		int count2=0;
		
		for(int i=0;i<strarray2.length;i++)
		{
			count2=1;
			if(strarray2[i]!=' ')
			{
				for(int j=i+1;j<strarray2.length;j++)
				{
					if(strarray2[i]==strarray2[j])
					{
						count2++;
						strarray2[j]=' ';
			
					}
				}
			}
			
			if(strarray2[i]!=' ')
			{
				System.out.println("Number of occurrences of: " +strarray2[i]+ " is "+ count2);
			}
		}
	}
}
