package com.hemanth.test;

public class Test {
	
	private int a;
	private int b;
	
	private Test() {
		System.out.println("Test : 0-param constructor");
	}
	
	//alt+shift+s, o
	private Test(int a, int b) {
		System.out.println("Test : 2- Param Constructor");
		this.a = a;
		this.b = b;
	}
	
	//alt+shift+s, s
	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + "]";
	}
	
	

}
