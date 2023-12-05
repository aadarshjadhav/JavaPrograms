package com.stackassignments;

import java.util.Objects;

public class Student{ //implements Comparable<Student>{ //No use implementing comparable interface becase Stack Class never calls compareTo mthod
	
	int studid;
	String studname;
	
	public Student(int studid, String studname) {
		super();
		this.studid = studid;
		this.studname = studname;
	}

	public int getStudid() {
		return studid;
	}

	public void setStudid(int studid) {
		this.studid = studid;
	}

	public String getStudname() {
		return studname;
	}

	public void setStudname(String studname) {
		this.studname = studname;
	}

	@Override
	public String toString() {
		return "Student [studid=" + studid + ", studname=" + studname + "]";
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(studid, studname);
//	}

	//Search method calls equals method, and we override it here
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return studid == other.studid && Objects.equals(studname, other.studname);
	}

	//No use implementing comparable interface because Stack Class never calls compareTo mthod

	//	@Override
//	public int compareTo(Student o) {
//		
//		if(this.studid<o.studid)
//			return 1;
//		else if(this.studid>o.studid)
//			return -1;
//		else
//			return 0;
//	}

	


	
	

}
