package com.hemanth.test;

import java.lang.reflect.Constructor;

public class ReflectionAPI_Instantiation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//Load the class at runtime
			Class c= Class.forName(args[0]);
			//create object dynamically
			Object obj1 = c.newInstance();
			System.out.println(obj1.toString());
			System.out.println("----------------------------------------");
			
			Constructor cons[] = c.getDeclaredConstructors();
			Object obj2 = cons[0].newInstance();
			System.out.println("Obj2 ::"+obj2.toString());
			System.out.println("-----------------------------------------");
			
			Object obj3 = cons[1].newInstance(10, 20);
			System.out.println("Obj3 ::"+obj3.toString());
			System.out.println("-----------------------------------------");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
