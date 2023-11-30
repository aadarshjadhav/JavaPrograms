package com.maphashmap;

public class Apple {
	
	int price;
	String type;
	
	public Apple()
	{
		
	}
	
	public Apple(int price, String type)
	{
		super();
		this.price = price;
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "AppleMap [price=" + price + ", type=" + type + "]";
	}
	
	@Override
	public int hashCode()
	{
		final int prime =31;
		int result=1;
		result=prime*result+price;
		result=prime*result+((type==null)?0:type.hashCode());
		System.out.println("Inside hashCode method:"+result);
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		System.out.println("Inside equals method");
		
		if(this==obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		
		Apple other=(Apple) obj;
		
		if(price != other.price)
			return false;
		if(type==null)
		{
			if(other.type !=null)
				return false;
		}
		else if(!type.equals(other.type))
			return false;
		
		return true;
			
	}

}
