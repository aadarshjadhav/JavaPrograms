package com.testprograms5;

public class Shipment{
	
	int shipid;
	String custname;
	Address ads;
	MyDate shipdate;
	
	public Shipment(int shipid, String custname, Address ads, MyDate shipdate) {
		super();
		this.shipid = shipid;
		this.custname = custname;
		this.ads = ads;
		this.shipdate = shipdate;
	}

	public int getShipid() {
		return shipid;
	}

	public void setShipid(int shipid) {
		this.shipid = shipid;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public Address getAds() {
		return ads;
	}

	public void setAds(Address ads) {
		this.ads = ads;
	}

	public MyDate getShipdate() {
		return shipdate;
	}

	public void setShipdate(MyDate shipdate) {
		this.shipdate = shipdate;
	}

	@Override
	public String toString() {
		return "Shipment [shipid=" + shipid + ", custname=" + custname + ", ads=" + ads + ", shipdate=" + shipdate
				+ "]";
	}

	
	
	
	

}
