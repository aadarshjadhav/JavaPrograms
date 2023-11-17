package diwalitest2;

public class Car {
	
	String color;
	public void changeColor(Car c2)
	{
		c2.color = color;
		this.color = "Red";
		System.out.println("color iniside function:"+c2.color);
	}


}
