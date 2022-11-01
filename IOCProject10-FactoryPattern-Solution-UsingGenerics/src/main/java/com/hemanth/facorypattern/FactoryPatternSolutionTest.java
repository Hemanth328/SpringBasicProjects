package com.hemanth.facorypattern;

import com.hemanth.comp.AadharDetails;
import com.hemanth.comp.Employee;
import com.hemanth.comp.Person;
import com.hemanth.comp.Student;
import com.hemanth.factory.PersonFactory;

public class FactoryPatternSolutionTest {
	public static void main(String[] args) {
		
		try {
			Employee emp = PersonFactory.getPerson(Employee.class);
			System.out.println(emp);
			System.out.println("==================================");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			Student stud = PersonFactory.getPerson(Student.class);
			System.out.println(stud);
			System.out.println("***********************************");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
