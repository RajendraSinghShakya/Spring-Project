package com.raj.spring.lifecycle;

import javax.annotation.PostConstruct;


import javax.annotation.PreDestroy;

import org.springframework.stereotype.Repository;

public class Example {
private String subject;

public String getSubject() {
	return subject;
}

@Override
public String toString() {
	return "Example [subject=" + subject + "]";
}

public void setSubject(String subject) {
	this.subject = subject;
}
@PostConstruct
public void start()
{
	this.subject = "ABC";
}
@PreDestroy
public void end()
{
	System.out.println("Ending Method");
}
}
