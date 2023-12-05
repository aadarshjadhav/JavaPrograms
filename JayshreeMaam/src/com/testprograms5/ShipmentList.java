package com.testprograms5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShipmentList {
	
	public static void main(String args[])
	{
		List<Shipment> list= new ArrayList<Shipment>();
		
		list.add(new Shipment(10001, "Aadarsh", new Address("House 1","Pune","Maharshtra"), new MyDate(11,12,2023)));
		list.add(new Shipment(10002, "Shudarshan", new Address("House 2","Delhi","Haryana"), new MyDate(04,10,2023)));
		list.add(new Shipment(10003, "Suraj", new Address("House 3","Mumbai","Maharshtra"), new MyDate(03,11,2021)));
		list.add(new Shipment(10004, "Ishwar", new Address("House 5","Banglore","Karnataka"), new MyDate(15,04,2020)));
		list.add(new Shipment(10005, "Prashant", new Address("House 4","Mysore","Telangana"), new MyDate(16,07,2023)));
		list.add(new Shipment(10005, "Sunish", new Address("House 5","Banglore","Telangana"), new MyDate(17,9,2023)));
																							//Doubt: literal out of range?: Octant problem, on 08, rather put just 8			
		
		ShipmentComparatorCityDate shipcompobj= new ShipmentComparatorCityDate();
		Collections.sort(list,shipcompobj);
		
		System.out.println(list);
		
	}

}
