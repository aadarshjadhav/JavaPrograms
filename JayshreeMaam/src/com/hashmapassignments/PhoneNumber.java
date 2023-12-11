package com.hashmapassignments;

public class PhoneNumber {

	long contact;

	

	public PhoneNumber(long contact) {
		super();
		this.contact = contact;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "PhoneNumber [contact=" + contact + "]";
	}
	
	
}
