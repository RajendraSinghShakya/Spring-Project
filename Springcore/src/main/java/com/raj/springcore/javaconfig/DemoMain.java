package com.raj.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.micrometer.observation.Observation.Context;

public class DemoMain {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/raj/springcore/javaconfig/config2.xml");
	Student student	=context.getBean("firststudent",Student.class);
		System.out.println(student);
		
		
		

	}

}
