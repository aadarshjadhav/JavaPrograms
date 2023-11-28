package com.exceptiondemo;

public class Gen<E> {
	
	E obj;
	Gen(E o)
	{
		obj=o;
	}
	E getObject()
	{
		return obj;
	}
    public static void main(String a[])
	{
		Gen<Integer> obj=new Gen<Integer>(10);
		Integer  i=obj.getObject();

		Gen<String>obj1=new Gen<String>("Java");
		String str=obj1.getObject();

	//	obj=obj1; //compile time error:Type mismatch: cannot convert from Gen<String> to Gen<Integer>
	}

}
