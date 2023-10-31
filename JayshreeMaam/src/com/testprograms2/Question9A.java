package com.testprograms2;

public class Question9A {
	
	static int i=6;
	static
	{
		System.out.println("Question9A");
		i= i-- - --i;
		System.out.println("Question9A i:" + i);
	}

}
