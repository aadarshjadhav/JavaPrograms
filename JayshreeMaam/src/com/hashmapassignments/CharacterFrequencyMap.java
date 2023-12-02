package com.hashmapassignments;

import java.util.HashMap;

public class CharacterFrequencyMap {
	
	public static void main(String args[])
	{
		String str="Aadarsh";
		HashMap<Character,Integer> string_map= new HashMap<Character,Integer>();
		
		char[] ch=str.toCharArray();
		
		
		for(int i=0;i<ch.length;i++)
		{
			char c=ch[i];
			
			if(string_map.containsKey(c))
			{
				int count= string_map.get(c);
				string_map.put(c,count+1);
			}
			else
			{
				string_map.put(c,1);
			}
		}
		System.out.println(string_map);
		
	}

}
