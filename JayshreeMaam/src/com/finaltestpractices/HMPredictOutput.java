package com.finaltestpractices;

import java.util.HashMap;
public class HMPredictOutput {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		System.out.println(hm.put(1,"a"));
		System.out.println(hm.put(2,"b"));
		System.out.println(hm.put(3,"c"));
		System.out.println(hm.put(1,"d"));
		System.out.println(hm.toString());
	}
}

/*:
    System.out.println(hm.put(1, "a"));: Adds the key-value pair (1, "a") to the HashMap. Since there was no previous mapping for key 1, put returns null.

    System.out.println(hm.put(2, "b"));: Adds the key-value pair (2, "b") to the HashMap. Since there was no previous mapping for key 2, put returns null.

    System.out.println(hm.put(3, "c"));: Adds the key-value pair (3, "c") to the HashMap. Since there was no previous mapping for key 3, put returns null.

    System.out.println(hm.put(1, "d"));: Updates the value associated with key 1 to "d". The previous value associated with key 1 was "a", so put returns the previous value, which is "a".

    System.out.println(hm.toString());: Prints the string representation of the HashMap after all the operations. The resulting HashMap is {1=d, 2=b, 3=c}.
 * 
 * */
