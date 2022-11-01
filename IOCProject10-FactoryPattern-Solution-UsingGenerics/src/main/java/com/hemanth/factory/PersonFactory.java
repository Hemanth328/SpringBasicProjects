package com.hemanth.factory;

import java.lang.reflect.Constructor;

import com.hemanth.comp.AadharDetails;
import com.hemanth.comp.Customer;
import com.hemanth.comp.Employee;
import com.hemanth.comp.Person;
import com.hemanth.comp.Student;


//Factory Pattern
public class PersonFactory {
	
	//Static Factory Method (having generic/common return type)
	 public static <T extends Person>  T getPerson(Class<T> clazz) throws Exception{
		 
		 Constructor cons[] = clazz.getDeclaredConstructors();
		 Object obj = null;
		 
		 if(clazz==Employee.class) {
			 AadharDetails details = new AadharDetails(123456L, 21, 98745632L);
			 obj = cons[0].newInstance("Reddy Hemanth Kumar", "Vizag", details, "TechMahin", 98564.12);
		 }
		 else if(clazz==Student.class) {
			 AadharDetails details = new AadharDetails(45632178L, 23, 6587453L);
			 obj = cons[0].newInstance("Hemanth", "VZM", details, "SpringBoot", 1102);
		 }
		 else if(clazz==Customer.class){
			 AadharDetails details = new AadharDetails(587964L, 20, 95874621L);
			 obj = cons[0].newInstance("Hemanth Kumar", "NJP", details, 011244533, 563241.02);
		 }
		 else {
			 throw new IllegalArgumentException("Invalid Class Type");
		 }
		 
		return (T) obj;
	 }

}
