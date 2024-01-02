package com.finaltestpractices;

//Q4. Write a code to display all two digit numbers which can be formed in such 
// way that difference between digits in number is 4  or -4.  Eg.15, 26, 37, 48, 59 ,51,62 etc.	

public class AllTwoDifferenceDigits {

	 public static void main(String[] args) {
	        System.out.println("Two-digit numbers with a difference of 4 or -4 between digits:");

	        for (int number = 10; number <= 99; number++) {
	            if (hasDifferenceOfFour(number) || hasDifferenceOfNegativeFour(number)) {
	                System.out.print(number + " ");
	            }
	        }
	    }

	    // Helper method to check if a number has a difference of 4 between its digits
	    private static boolean hasDifferenceOfFour(int num) {
	        int digit1 = num / 10;
	        int digit2 = num % 10;
	        return Math.abs(digit1 - digit2) == 4;
	    }

	    // Helper method to check if a number has a difference of -4 between its digits
	    private static boolean hasDifferenceOfNegativeFour(int num) {
	        int digit1 = num / 10;
	        int digit2 = num % 10;
	        return Math.abs(digit1 - digit2) == -4;
	    }

}
