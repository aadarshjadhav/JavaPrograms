package diwalitest5;

import java.util.Arrays;

public class Seat {

	int seatno;
	String seatType;
	int price;
	
	public Seat()
	{
		
	}
	
	public Seat(int seatno,String seatType, int price)
	{
		this.seatno=seatno;
		this.seatType=seatType;
		this.price=price;
	}
	
	public void setSeatno(int seatno)
	{
		this.seatno=seatno;
	}
	
	public void setSeatType(String seatType)
	{
		this.seatType=seatType;
	}
	
	public void setSeatPrice(int price)
	{
		this.price=price;
	}
	
	public String toString()
	{
		return " Seat id:" + seatno+ " Seatype:"+ seatType+ " Seat Price:"+ price;
	}
	
	
}
