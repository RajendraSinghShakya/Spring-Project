
package com.raj.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/raj/springcore/stereotype/stereoconfig.xml");
		Student student = context.getBean("student", Student.class);
		Teacher teacher = (Teacher) context.getBean("teacher");
		Teacher teacher1 = (Teacher) context.getBean("teacher");
		/*
		 * System.out.println(student); System.out.println(student.getAddress());
		 * System.out.println(student.getAddress().getClass().getName());
		 */
		/*
		 * System.out.println(student.hashCode()); Student
		 * student1=context.getBean("student",Student.class);
		 * System.out.println(student1.hashCode());
		 * 
		 */
		System.out.println(teacher.hashCode());
		System.out.println(teacher1.hashCode());
		System.out.println(student);
	}

}
