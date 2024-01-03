package com.finaltestpractices;
/*Q13. Write a code to accept String from user. Display the words with two vowels in it. In output such word should not be repeated.					            	[1]
Eg.  If Given String is  : “My Country name is India. My Country is the BEST”.
Should display output as :   Country , name , India
 * 
 * */
public class String2Vowels {

	public static void main(String[] args) {
		
		String str="My Country name is India. My Country is the BEST";
		String str_array[]=str.split(" ");
	
		int m=0;
		String str_array_vowels[]= new String[]{};
		
		int count_vowel=0;
	
		
		for(int i=0;i<str_array.length;i++)   
		{
			
			char ch[]=str_array[i].toCharArray(); //ch= 'M','y'
			
			count_vowel=0;
			for(int k=0;k<ch.length;k++)
			{
				//System.out.println(ch[k]);
				
				if(ch[k]== 'a' || ch[k]== 'e'|| ch[k]== 'i'|| ch[k]== 'o'|| ch[k]== 'u' || ch[k]== 'A' || ch[k]== 'E'|| ch[k]== 'I'|| ch[k]== 'O'|| ch[k]== 'U')
				{
					count_vowel++;
					if(count_vowel>1)
					{
						//++m;
						//str_array_vowels[m]=str_array[i];
						str_array_vowels=addElement(str_array_vowels,str_array[i]);
						
						break;
					}
					
				}
			}
		}
		
		for(int i=0;i<str_array_vowels.length;i++)
		{
			System.out.println(str_array_vowels[i]);// Got the words thaht have two vowels, now removing duplicate words
			
		}
		
		
	}
	
	public static String[] addElement(String[] array_temp, String element)
	{
		String[] newArray = new String[array_temp.length+1];
		
		for(int i=0;i<array_temp.length;i++)
		{
			newArray[i]=array_temp[i];
		}
		
		newArray[array_temp.length]=element;
		return newArray;
	}

}
