package com.finaltestpractices.nov_batch_version_2;

public class Flats {
	
	String flatNo;

	public Flats(String flatNo) {
		super();
		this.flatNo = flatNo;
	}

	public String getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}

	@Override
	public String toString() {
		return "Flats [flatNo=" + flatNo + "]";
	}
	
	

}
