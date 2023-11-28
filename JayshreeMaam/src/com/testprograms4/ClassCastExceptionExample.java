package com.testprograms4;

import com.exceptiondemo.NonGen;

public class ClassCastExceptionExample {
	

	Object obj;
	ClassCastExceptionExample()
	{
		
	}
	ClassCastExceptionExample(Object o)
	{
		this.obj=o;
	}
	void showType()
	{
		System.out.println(obj.getClass());
	}
	Object getObj()
	{
		return obj;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassCastExceptionExample obj=new ClassCastExceptionExample(12);
		obj.showType();
		System.out.println(obj.getObj());
		int i=(int) obj.getObj();
		ClassCastExceptionExample obj1=new ClassCastExceptionExample("Java");
		obj1.showType();
		String str=(String) obj1.getObj(); // 1 every time while getting the value we need to be typecasting
		
		obj=obj1; 
		int v=(int) obj.getObj(); //2 ClassCastException
		
		//Another Example below
		Object obj2 = "Hello, World!";
		Integer num = (Integer) obj2;
		
	}
}
