package com.testprograms6;

public class Candidate implements Comparable<Candidate>{
	

	int cid;
	String cname;
	double m1=0;
	double m2=0;
	double m3=0;
	double percentage=0;
	
	public Candidate(int cid, String cname, double m1, double m2, double m3) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		
		//Calculate percentage here and assign it here
		this.percentage = ((m1+m2+m3)/150)*100;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public double getM1() {
		return m1;
	}

	public void setM1(double m1) {
		this.m1 = m1;
	}

	public double getM2() {
		return m2;
	}

	public void setM2(double m2) {
		this.m2 = m2;
	}

	public double getM3() {
		return m3;
	}

	public void setM3(double m3) {
		this.m3 = m3;
	}

	public double getPercentage() {
		
		return percentage;
	}

	public void setPercentage(double percentage) {
		
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Candidate [cid=" + cid + ", cname=" + cname + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3
				+ ", percentage=" + percentage + "]";
	}

	@Override
	public int compareTo(Candidate o) {
		
		if(this.percentage<o.percentage)
			return 1;
		else if(this.percentage>o.percentage)
			return -1;
		else
			return 0;
	}
	
	
}
