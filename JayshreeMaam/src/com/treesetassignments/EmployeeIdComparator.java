package com.treesetassignments;

import java.util.Comparator;

public class EmployeeIdComparator implements Comparator<Employee>{
	
	public int compare(Employee o1, Employee o2)
	{
		if(o1.empid>o2.empid)
			return 1;
		else if(o1.empid<o2.empid)
			return -1;
		else
			return 0;
	}

}
