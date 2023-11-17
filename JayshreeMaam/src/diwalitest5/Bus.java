package diwalitest5;

import java.util.Arrays;

public class Bus {
	
	int busid;
	Seat[] sarr;
	
	public Bus()
	{
		
	}
	
	public Bus(int busid, Seat[] sarr)
	{
		this.busid=busid;
		this.sarr=sarr;
	}
	
	public void setBusId(int busid)
	{
		this.busid=busid;
	}
	
	public void setSeat(Seat sarr[])
	{
		this.sarr=sarr;
	}
	
	public String toString()
	{
		return "Bus details- "+ " Bus id:" + busid+ " Seat"+Arrays.toString(sarr);
	}

}
