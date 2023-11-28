package com.arraylistdemos;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		
		if(o1.empname==o2.empname)
		{
			return o1.empsal.compareTo(o2.empsal);
		}
		else
		{
			return o1.empname.compareTo(o2.empname);
		}
		
		
	}

}
