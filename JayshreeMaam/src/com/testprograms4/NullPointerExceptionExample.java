package com.testprograms4;

public class NullPointerExceptionExample {
	
	 public static void main(String[] args) {
	        // Declaring a reference to an object without initializing it
	        MyClass myObject = null;

	        try {
	            // Attempting to call a method on the uninitialized object
	            int result = myObject.calculateSquare(5);
	            System.out.println("Result: " + result);
	        } catch (NullPointerException e) {
	            System.out.println("NullPointerException caught: " + e.getMessage());
	        }
	    }
	}

	class MyClass {
	    public int calculateSquare(int num) {
	        return num * num;
	    }
	}
