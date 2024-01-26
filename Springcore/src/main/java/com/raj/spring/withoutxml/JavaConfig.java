package com.raj.spring.withoutxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages ="com.raj.spring.withoutxml" )

//to create object without @component annotation
public class JavaConfig {

	/*
	 * @Bean public Samosa getsamosa() { return new Samosa();
	 * 
	 * 
	 * }
	 */
	@Bean
	public Student getStudent() {
		// creating object
		Student student = new Student(new Samosa());
		return student;

	}

}
