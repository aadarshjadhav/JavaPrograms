package com.testingtopics;

import java.util.Comparator;

public class DepartmentLocationComparator1 implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
	//	return o1.dep.getLocation().compareTo(o2.dep.getLocation());
		
		return o1.compareTo(o2); //Doubt:So, if we pass only two object, it sorts default based on the first parameter
	}

}
