package com.raj.spring.withoutxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.micrometer.observation.Observation.Context;

public class DemoMain {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		
		//Two ways type casting
	//Student student	=(Student) context.getBean("student");
	  Student student	= context.getBean("getStudent",Student.class);
		System.out.println(student);
		student.study();
		
		
		

	}

}
