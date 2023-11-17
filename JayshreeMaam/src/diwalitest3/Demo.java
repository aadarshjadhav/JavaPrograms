package diwalitest3;

public class Demo {
	//Doubt, how is it possible that output is Pink for both objects?
	public static void main(String[] args) 
	{	Car c1 = new Car(); 
		c1.color = "Blue";
		System.out.println("C1 color:" + c1.color);
		Car c2=new Car();
		changeColor(c1);
		c2.color="Pink";
		System.out.println(c1.color);
		System.out.println(c2.color);
	}
	public static void changeColor(Car c1) {
		c1.color = "Yellow";
		System.out.println("C1 color:" + c1.color);
	
	}
}


