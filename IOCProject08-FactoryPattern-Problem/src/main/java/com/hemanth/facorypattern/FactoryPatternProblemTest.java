package com.hemanth.facorypattern;

import com.hemanth.comp.AadharDetails;
import com.hemanth.comp.Employee;
import com.hemanth.comp.Person;
import com.hemanth.comp.Student;

public class FactoryPatternProblemTest {
	public static void main(String[] args) {
		// Create AadharDetails Object
		
		AadharDetails details = new AadharDetails(1234L, 22, 0123456L);
		Person emp = new Employee("Hemanth", "VSKP", details, "VMware", 58976.32);
		System.out.println(emp);
		System.out.println("==================================");
		
		AadharDetails details1 = new AadharDetails(123456L, 05, 12345467L);
		Person stud = new Student("Reyansh", "NLR", details1, "Java", 1101);
		System.out.println(stud);
		System.out.println("***********************************");
		
		
		
	}

}
