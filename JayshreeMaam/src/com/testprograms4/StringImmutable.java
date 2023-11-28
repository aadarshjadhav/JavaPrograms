package com.testprograms4;

public class StringImmutable {
	
	    public static void main(String[] args) {
	        // Original string
	        String originalString = "Hello";

	        // Attempting to "modify" the string
	        String modifiedString = originalString.concat(", World!"); // Concatenating to create a new string

	        // Displaying both strings
	        System.out.println("Original String: " + originalString);
	        System.out.println("Modified String: " + modifiedString);

	        // Checking if the original string is still the same
	        System.out.println("Original String after modification attempt: " + originalString);

	        // Demonstrating that they are different objects
	        System.out.println("Are they the same object? " + (originalString == modifiedString));
    }
}

