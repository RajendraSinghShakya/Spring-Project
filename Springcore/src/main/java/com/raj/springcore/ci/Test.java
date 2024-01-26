package com.raj.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/raj/springcore/ci/ciconfg.xml");
		//Person p = (Person) context.getBean("person");
		Person p =  context.getBean("person",Person.class);
		System.out.println(p);

		Addition add = (Addition) context.getBean("add");
		add.dosum();
	}

}
