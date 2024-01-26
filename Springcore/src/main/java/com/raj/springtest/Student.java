package com.raj.springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("firststudent")
public class Student {
	private Samosa samosa;

	public Samosa getSamosa() {
		return samosa;
	}

	@Autowired
	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public void study() {
	
		System.out.println("student is Reading books");

	}

}
