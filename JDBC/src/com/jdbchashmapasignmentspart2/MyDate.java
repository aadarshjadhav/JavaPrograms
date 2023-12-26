package com.jdbchashmapasignmentspart2;

import java.util.*;
import java.sql.Date;

public class MyDate implements Comparable<MyDate>{
	
	int dd;
	int mm;
	int yy;
	
	Date d;
	
	public MyDate(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public int getYy() {
		return yy;
	}

	public void setYy(int yy) {
		this.yy = yy;
	}
	
	

	public Date getD() {
		return d;
	}

	public void setD(Date d) {
		this.d = d;
	}

	@Override
	public int compareTo(MyDate o) {
		
		if(this.dd>o.dd && this.mm>o.mm && this.yy>o.yy)
			return 1;
		else
			return 0;
	}
	
	

}
