package com.raj.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.micrometer.observation.Observation.Context;

public class DemoMain {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/raj/springtest/autoconfig.xml");
		
	
	Student student	=(Student) context.getBean("firststudent");
	
		System.out.println(student);
		student.getSamosa().taste();
		
		
		
		

	}

}
