package com.raj.spring.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Samosa {
	private double price;
	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	
	public void init()
	{
		System.out.println("Inside init method - XML");
	}
	public void destroy()
	{
		System.out.println("Inside destroy method - XML");
	}

	@PostConstruct
	public void start()
	{		
		System.out.println("init method of annotation");
	}
	@PreDestroy
	public void end()
	{
		System.out.println("Ending Method by annotation");
	}


}
