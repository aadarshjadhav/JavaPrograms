package com.filehandling;

import java.io.Serializable;

public class MyDate implements Serializable{
	
// data member
	private int dd, mm, yy;

	public MyDate() {

		System.out.println("I am in default Const of Mydate1");
		dd = 17;
		mm = 10;
		yy = 2023;

	}

	public MyDate(int dd, int mm, int yy) {

		System.out.println(" parametric cons of Mydate1");

		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public void setDd(int d) {
		dd = d;
	}

	public void setMm(int m) {
		mm = m;
	}

	public void setYy(int y) {
		yy = y;
	}

	public int getDd() {
		return dd;
	}

	public int getMm() {
		return mm;
	}

	public int getYy() {
		return yy;
	}

	

	public String toString() {
		return dd + "/" + mm + "/" + yy;
	}

}