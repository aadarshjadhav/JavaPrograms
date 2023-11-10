package com.arrayassignments;
/*15.WAP to merge 2 arrays to 3rd array. 
 * 3rd array should not have elements of same value.*/

public class Question15Merge {
	
	public static int[] mergeTwoArrays(int array1[], int array2[])
	{
		
		int count_unique_elements=0;
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array2.length;j++)
			{
				if(array1[i]!=array2[j])
				{
					count_unique_elements++;
				}
			}
			
		}
		
		int array3[]= new int[array1.length+count_unique_elements];
		array3=array1;
		for(int i=array1.length-1;i<array2.length;i++)
		{
			if()
		}
		
	}
	
	public static void main(String args[])
	{
		int array1[]= {1,2,3,4,5};
		int array2[]= {2,1,6,7,5,8,9,1};
		
		int array3[]= new mergeTwoArrays(array1, array2);
	}

}
