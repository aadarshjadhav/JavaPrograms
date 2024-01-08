package com.finaltestpractices.nov_batch_version_2;

public class MainClassAccess {
                   
		public static void main (String arg[]){
			Access obj1 = new Access();                
			Access obj2 = new Access(); 							
			obj1.x = 0;                                            
			obj1.increament();		
			obj2.increament();		
			System.out.println("obj1.x "+obj1.x );
			System.out.println("obj2.x "+obj2.x );
			System.out.print(obj1.x + obj2.x);			
			System.out.println();								
		}
}