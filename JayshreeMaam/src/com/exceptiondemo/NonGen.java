package com.exceptiondemo;

public class NonGen {

	Object obj;
	NonGen()
	{
		
	}
	NonGen(Object o)
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
		
		NonGen obj=new NonGen(12);
		obj.showType();
		System.out.println(obj.getObj());
		int i=(int) obj.getObj();
		NonGen obj1=new NonGen("Java");
		obj1.showType();
		String str=(String) obj1.getObj(); // 1 every time while getting the value we need to be typecasting
		
		obj=obj1; 
		int v=(int) obj.getObj();	//2 ClassCastException
		
		//Another Example below
		Object obj2 = "Hello, World!";
		Integer num = (Integer) obj2;
	}


}
