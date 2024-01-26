package com.raj.spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean  {
	private double price;

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void afterPropertiesSet() throws Exception {
		//init
		System.out.println("taking pepsi:init");
		
	}

	public void destroy() throws Exception {
		// destroy
		System.out.println("going to put bottle back to shop:destroy");
		
	}
	

}
