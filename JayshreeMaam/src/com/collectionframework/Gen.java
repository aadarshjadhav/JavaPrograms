package com.collectionframework;

public class Gen<T> {
	
	T obj;
	
	Gen(T o)
	{
		obj=o;
	}
	
	T getObject()
	{
		return obj;
	}
	
	public static void main(String args[])
	{
		Gen<Integer> obj=new Gen<Integer>(10);
		Integer i=obj.getObject();
		
		Gen<String>obj1=new Gen<String>("Java");
		String str=obj1.getObject();
		
	//	obj=obj1; //Compile time error
	}

}
