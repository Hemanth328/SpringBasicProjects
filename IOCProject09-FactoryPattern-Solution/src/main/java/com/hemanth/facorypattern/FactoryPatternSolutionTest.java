package com.hemanth.facorypattern;

import com.hemanth.comp.AadharDetails;
import com.hemanth.comp.Employee;
import com.hemanth.comp.Person;
import com.hemanth.comp.Student;
import com.hemanth.factory.PersonFactory;

public class FactoryPatternSolutionTest {
	public static void main(String[] args) {
		// use Factory to create Employee class Obj
		
		Person emp = PersonFactory.getPerson("emp");
		System.out.println(emp);
		System.out.println("==================================");
		
	
		Person stud = PersonFactory.getPerson("stud");
		System.out.println(stud);
		System.out.println("***********************************");
		
	}

}
