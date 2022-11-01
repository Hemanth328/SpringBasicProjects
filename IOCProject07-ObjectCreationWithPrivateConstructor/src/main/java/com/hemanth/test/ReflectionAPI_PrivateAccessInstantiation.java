package com.hemanth.test;

import java.lang.reflect.Constructor;

public class ReflectionAPI_PrivateAccessInstantiation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Test t = new Test(); can not create an object with private constructors 
	
		
		try {
			//Load the class at runtime
			Class c= Class.forName(args[0]); // Here we are able to create cause it is using reflectionAPI
			//create object dynamically
			
			
			/*
			 * Object obj1 = c.newInstance(); System.out.println(obj1.toString());
			 * System.out.println("----------------------------------------");
			 */
			 
			
			Constructor cons[] = c.getDeclaredConstructors(); // getDeclaredConstructors() will get all the constructors present in that class
			
			
			cons[0].setAccessible(true);
			Object obj2 = cons[0].newInstance();
			System.out.println("Obj2 ::"+obj2.toString());
			System.out.println("-----------------------------------------");
			
			cons[1].setAccessible(true);
			Object obj3 = cons[1].newInstance(10, 20);
			System.out.println("Obj3 ::"+obj3.toString());
			System.out.println("-----------------------------------------");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
