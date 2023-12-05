package com.treesetassignments;

import java.util.TreeSet;

public class CompareTwoSet {
	
	public void compare(TreeSet<String> treeset, TreeSet<String> treeset1)
	{
		if(treeset.size()==treeset1.size())
		{
			int count=0;
			for(String x:treeset)
			{
				for(String y:treeset1)
				{
					if(x.equals(y))
					{
						count++;
					}
				}
			}
			
			if(count==treeset.size())
				System.out.println("Two treesets are equal!");
			else
				System.out.println("Two treesets are different!");
			
		}
		else
			System.out.println("Two treesets are different!!");
	}
	
	public static void main(String args[])
	{
		TreeSet<String> treeset= new TreeSet<>();
		treeset.add("Blue");
		treeset.add("Red");
		treeset.add("Purple");
		treeset.add("White");
		
		TreeSet<String> treeset1= new TreeSet<>();
		treeset1.add("Blue");
		treeset1.add("Red");
		treeset1.add("Purple");
		treeset1.add("White");
		
		System.out.println("The two set eqals:"+treeset.equals(treeset1));
		
		CompareTwoSet cts= new CompareTwoSet();
		cts.compare(treeset,treeset1);
		
	}

}
