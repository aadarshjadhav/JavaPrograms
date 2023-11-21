package com.collectionframework;

public class Non_Gen {

	Object obj;
	
	Non_Gen()
	{
		
	}
	
	Non_Gen(Object o)
	{
		this.obj=o;
	}
	
	void showType()
	{
		System.out.println(obj.getClass());  //Shows name of the class type
	}
	
	Object getObj()
	{
		return obj;
	}
	
	public static void main(String[] args)
	{
		Non_Gen obj= new Non_Gen(12);
		obj.showType();
		System.out.println(obj.getObj());
		int i=(int)obj.getObj();		//Type casting from object type to integer type
		Non_Gen obj1= new Non_Gen("Java");
		obj1.showType();
		String str=(String) obj1.getObj();
		
		obj=obj1; //Error:String cannot be cast to class java.lang.Integer
		int v=(int) obj.getObj();
	}
}
