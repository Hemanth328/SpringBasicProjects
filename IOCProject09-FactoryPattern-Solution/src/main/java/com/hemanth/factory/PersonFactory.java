package com.hemanth.factory;

import com.hemanth.comp.AadharDetails;
import com.hemanth.comp.Customer;
import com.hemanth.comp.Employee;
import com.hemanth.comp.Person;
import com.hemanth.comp.Student;


//Factory Pattern
public class PersonFactory {
	
	//Static Factory Method (having generic/common return type)
	 public static Person getPerson(String type) {
		 // All local variables must be initialized so have taken null as these are local to this method
		 // and reference variables can have null or address of the object
		 Person per = null;
		 AadharDetails details = null;
		 
		 if(type.equalsIgnoreCase("emp")) {
			 details = new AadharDetails(123456L, 22, 987654321L);
			 per = new Employee("Hemanth", "VSKP", details, "INFOSYS", 56894.0);
		 }
		 else if(type.equalsIgnoreCase("cust")){
			 details = new AadharDetails(8965472L, 21, 87564621L);
			 per = new Customer("Reyansh", "NLR", details, 001156624, 32654.02);
		 }
		 else if(type.equalsIgnoreCase("stud")){
			 details = new AadharDetails(4562314L, 23, 765894213L);
			 per = new Student("Deeksha", "VZM", details, "Java", 1101);
		 } else {
			 throw new IllegalArgumentException("Invalid Person Type");
		 }
		 
		return per;
	 }

}
