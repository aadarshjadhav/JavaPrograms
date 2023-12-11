package com.testprograms6;
/*.  If input string is ‘My Name is Yasmin’, then first non-repeating letter is ‘e’.
 * 
 * */

public class FirstNonRepaeatingStringCharacter {
	
	public static void main(String args[])
	{
		String str= "My Name is Yasmin";
		char ch[]=str.toCharArray();
		
		
//		for(char i:ch)
//			System.out.println(i);
		
		for(int i=0;i<ch.length;i++)
		{
			int count=0;
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]==ch[j] || ch[i]==ch[j]-32 || ch[i]==ch[j]+32)
				{
					count++;
				}
			}
			
			if(count==1)
			{
				System.out.println(ch[i]);
			}
		}
		
	}

}
