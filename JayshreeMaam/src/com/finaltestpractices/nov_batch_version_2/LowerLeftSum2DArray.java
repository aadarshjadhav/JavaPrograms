package com.finaltestpractices.nov_batch_version_2;

public class LowerLeftSum2DArray {

	public static void main(String[] args) {
		
		
		int array[][]= {{12,5,8},{8,3,6},{1,8,0}};
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				if(i>=j)
					sum+=array[i][j];
			}
		}
		System.out.println("sum:"+sum);
		
	}

}
