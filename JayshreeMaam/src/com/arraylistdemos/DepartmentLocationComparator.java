package com.arraylistdemos;

import java.util.Comparator;

public class DepartmentLocationComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.dep.depname.compareTo(o2.dep.depname);
	}

}
