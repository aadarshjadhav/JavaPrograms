package com.stringassignments;

public class Valid_Phone_Number {
	
	public static void main(String args[])
	{
		String str="8586508165";
		char ch[]=str.toCharArray();
		
		String str2="0123456789";
		char ch2[]=str.toCharArray();
		int count=0;
		boolean status=true;
		
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]>=48 && ch[i]<=57)
			{
				count++;
				continue;
			}
		}
		if(count==10)
		{
			System.out.println("Entered number is valid");
		}
		
//		for(int i=0;i<str.length();i++)
//		{
//			if(status==true)
//			{
//				for(int j=0;j<str.length();j++)
//				{
//					if(ch[i]==ch2[j])
//					{
//						count++;
//						continue;
//					}
//					else
//					{
//					//	System.out.println("Invalid character!!!");
//						status=false;
//						break;
//					}
//				}
//			}
//			else
//			{
//				System.out.println("Invalid number!!!!");
//				break;
//			}
//			
//		}
		
	}

}
