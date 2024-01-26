package com.raj.springcore.autowire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	
	public static void main(String[] args) {
	
		
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/raj/springcore/autowire/autoconfig.xml");
						Emp emp=(Emp) context.getBean("emp");
						System.out.println(emp);
	
	


}}
