package com.raj.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {

	
	
	private Address address;

	@Override
	public String toString() {

		return "Emp [address=" + address + "]";
	}

	public Address getAddress() {

		return address;
	}
	
	
	/*
	 * public Emp(Address address) { super();
	 * 
	 * System.out.println("called by the constructor"); this.address = address; }
	 */
		
	@Autowired
	@Qualifier("address2")
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("called by the setter method");
	}

}
