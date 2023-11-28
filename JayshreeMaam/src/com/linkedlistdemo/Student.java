package com.linkedlistdemo;

public class Student implements Comparable<Student>
{
	int sid;
	String snanme;
	int percent;
	int bid;
	//Mydate date;
	float ht;
	
	public Student() {
		
	}
	
	public Student(int sid, String snanme, int percent) {
		super();
		this.sid = sid;
		this.snanme = snanme;
		this.percent = percent;
		this.bid = bid;
		this.ht = ht;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSnanme() {
		return snanme;
	}

	public void setSnanme(String snanme) {
		this.snanme = snanme;
	}

	public int getPercent() {
		return percent;
	}

	public void setPercent(int percent) {
		this.percent = percent;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public float getHt() {
		return ht;
	}

	public void setHt(float ht) {
		this.ht = ht;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", snanme=" + snanme + ", percent=" + percent + ", bid=" + bid + ", ht=" + ht
				+ "]";
	}

	@Override
	public int compareTo(Student o) {
		return 0;
	}
	
	
}
