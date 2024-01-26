package com.raj.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("ob") we can change the class name
@Component
@Scope("prototype")
public class Student {
	@Value("#{20+30}")
	private String studentName;
	@Value("agra")
	private String city;
	
	@Value("#{id}")
	private List<String>address;
	
	public String getStudentName() {
		return studentName;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	

}
