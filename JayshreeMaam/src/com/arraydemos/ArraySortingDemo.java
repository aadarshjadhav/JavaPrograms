package com.arraydemos;
import java.util.Arrays;

public class ArraySortingDemo {

	public static void main(String[] args)
	{
		float [] resultArray= {69.4f, 75.4f, 43.22f};
	
		System.out.println("Array Before Sorting"+ Arrays.toString(resultArray));
		
		Arrays.sort(resultArray);
		
		System.out.print("Array after sorting" +Arrays.toString(resultArray));
	}
}
