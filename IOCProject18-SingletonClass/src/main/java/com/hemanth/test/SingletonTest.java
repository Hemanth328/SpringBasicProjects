package com.hemanth.test;

import com.hemanth.singleton.Printer;

public class SingletonTest {
	public static void main(String[] args) {
		Printer p1 = Printer.getInstance();
		Printer p2 = Printer.getInstance();
		
		p1.print("Hello, Hemanth !");
		p1.print("Hey, How are you doing !");
		
		System.out.println(p1.hashCode()+"   "+p2.hashCode());
		System.out.println("p1==p2?"+(p1==p2));
	}

}
