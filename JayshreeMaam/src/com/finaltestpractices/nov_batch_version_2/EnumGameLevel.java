package com.finaltestpractices.nov_batch_version_2;

import java.util.Scanner;

/*
 * Q9. Write Enum Type Level with constants defined like 
 * BASIC(50), INTERMEDIATE(100),HADRD(200). 
 * Accept which level of game user wants to play. 
 * Write a code with Switch case statement, 
 * to display bonus points given to user based on which  level he has selected. 
 * 50 points for BASIC Level,100 for INTERMEDIATE and 200 points  for HARD level are given  	
 * */

public class EnumGameLevel {
		
	/*
	 * Java Enums can be thought of as classes which have a fixed set of constants (a variable that does not change). 
	 * The Java enum constants are static and final implicitly.
	 * Enum can have constructors and methods
	 * Whenever we call a enum constant, it calls its constructor
	 * */
	enum Level  //Enum 
	{
		BASIC(50),
		INTERMEDIATE(100),
		HARD(200);
		
		private final int bonusPoints;

	    Level(int bonusPoints) {
	        this.bonusPoints = bonusPoints;
	    }

	    public int getBonusPoints() {
	        return bonusPoints;
	    }
	}
	
	
    
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Prompt user to choose a game level
        System.out.println("Choose a game level: ");
        System.out.println("1. BASIC");
        System.out.println("2. INTERMEDIATE");
        System.out.println("3. HARD");
        int choice = scanner.nextInt();
        
        switch (choice) 
        {
        	case 1:	System.out.println("You selected Basic Level:"+ Level.BASIC.getBonusPoints());
        			break;
        	case 2:	System.out.println("You selected Basic Level:"+ Level.INTERMEDIATE.getBonusPoints());
        			break;
        	case 3:	System.out.println("You selected Basic Level:"+ Level.HARD.getBonusPoints());
        			break;
        			
        	default: System.out.println("You entered wrong option");
        	
        }

	}

}
