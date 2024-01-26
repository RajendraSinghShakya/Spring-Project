package com.raj.springcore.ci;

public class Addition {

	private int a;
	private int b;
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("constructor int, int");
	}

	public Addition(double a, double b) {
		
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("constructor double, double");
	}
	
public Addition(String a, String b) {
		
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("constructor string , string");
	}
	public void dosum (){
		System.out.println("Value of a is " + this.a);
		System.out.println("Value of b is " + b);
		System.out.println("sum is "+ (this.a+this.b));
	}
}
