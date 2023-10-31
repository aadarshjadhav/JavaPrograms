package com.overriding;

public class Pulsar extends Bike{
	
	String colour;
	int speed;
		/*public Pulsar()
		{
			
		}*/
		
		public Pulsar(String colour, int speed)
		{
			this.colour=colour;
			this.speed=speed;
		}
		
		public void bikeinfo()
		{
			System.out.println("Inside pulsar class functiton");
			System.out.println("Colour:"+colour + "Speed:"+speed);
			
		}
		
		public static void main(String args[])
		{
			Bike b= new Pulsar("Red", 100);
			Bike b= new Pulsar();
			Bike b2= new Bike("red", 10);
			b2.bikeinfo();
			//b.bikeinfo();
		}
}
