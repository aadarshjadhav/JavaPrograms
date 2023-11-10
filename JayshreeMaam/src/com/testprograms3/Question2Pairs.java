package com.testprograms3;
/*Write  a  java  program  to  find  all  pairs  of  elements  in  an  integer  array  whose  sum  is  equal to a given number?[1M]
	Input Array : [4, 6, 5, -10, 8, 5, 20]
	InputNumber:10
	Pairs  of  elements  whose  sum  is  10  are : 
	4 + 6 = 10
	5 + 5 = 10
	-10 + 20 = 10
*/
public class Question2Pairs {
	
	public static void main(String args[])
	{
		int array[]= {4,6,5,-10,8,5,20};
		int input_number=10;
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if((array[i]+array[j]==10))
				{
					System.out.println(array[i]+ " "+ array[j]);
				}
			}
		}
	}

}
