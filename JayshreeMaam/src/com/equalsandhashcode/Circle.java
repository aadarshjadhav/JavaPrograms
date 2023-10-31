package com.equalsandhashcode;


public class Circle {
	
	double v=2;
	
	public Circle()
	{
		
	}
	
	@Override
	public boolean equals(Object obj)
    {
   	 //Object obj=new Circle();
   	 System.out.println("In equals");
   	 Circle d=(Circle)obj;
   	 if(this.v==d.v)
   		 return true;
   	 else
   		 return false;
   	 
    }
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + v);
		
		return result;
	}
	
	public static void main(String args[])
	{
		Circle c= new Circle();
		//System.out.println(c.hashCode());
		Circle b= new Circle();
		//System.out.println(b.hashCode());
		
		Circle a=b;
		
		//System.out.println(c.equals(b));
		
		System.out.println(a.equals(b));
		System.out.println(a.hashCode());
		
	}

}
