package com.raj.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("com/raj/springcore/standalone/collection/aloneconfig.xml");		
	
                               Person person1=(Person) context.getBean("person1");
                               System.out.println(person1);
                               System.out.println(person1.getFriends());
								
								  System.out.println("========================");
								  System.out.println(person1.getFeestructure());
								  System.out.println("========================");
								 System.out.println(person1.getProp());
								 System.out.println(person1.getProp().getClass().getName());
								 	}

}
