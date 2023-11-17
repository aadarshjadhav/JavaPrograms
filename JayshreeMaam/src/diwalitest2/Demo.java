package diwalitest2;

public class Demo {
	
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "Blue";
		Car c2=new Car();
		c2.color="Pink";
		c2.changeColor(c1);
		
		System.out.println(c1.color);
		System.out.println(c2.color);	}
}



