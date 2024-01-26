package com.raj.springcore.autowire;

public class Emp {
	
	private Address address;
	
	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	public Address getAddress() {
		
		
		return address;
	}

	public Emp(Address address) {
		super();
		System.out.println("run by the constructor");
		this.address = address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	

	
}
