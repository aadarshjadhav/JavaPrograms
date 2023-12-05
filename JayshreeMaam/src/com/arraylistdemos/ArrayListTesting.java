package com.arraylistdemos;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTesting {
	
	public static void main(String args[])
	{
		
		 Integer marks1[] = {1, 2, 4, 5, 6};

        // Create an ArrayList<Integer> from the array
        ArrayList<Integer> L1 = new ArrayList<>(Arrays.asList(marks1));

        // Print the ArrayList
        System.out.println("ArrayList L1: " + L1);

	}

}
