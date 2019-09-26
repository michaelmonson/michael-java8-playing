package com.orlando.sorting;

import static java.util.Comparator.comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortEmployee {
	
	public static void main(String args[]) {
		
		Employee emp1 = new Employee(1, "Mary", "Monson", 41, "Eagle Mountain");
		Employee emp2 = new Employee(2, "Kathryn", "Monson", 67, "Logan");
		Employee emp3 = new Employee(3, "Alex", "Harroun", 48, "Orem");
		Employee emp4 = new Employee(4, "Amelia", "Monson", 10, "Eagle Mountain");
		Employee emp5 = new Employee(5, "Sharanne", "Mitchell", 71, "Orem");
		Employee emp6 = new Employee(6, "Michael", "Monson", 46, "Eagle Mountain");
		Employee emp7 = new Employee(7, "Brett", "Fenton", 49, "Elk Ridge");
		Employee emp8 = new Employee(8, "Celeste", "Monson", 16, "Eagle Mountain");	
		
		List<Employee> employees = new ArrayList<>();		
			employees.add(emp1);
			employees.add(emp2);
			employees.add(emp3);
			employees.add(emp4);
			employees.add(emp5);
			employees.add(emp6);
			employees.add(emp7);
			employees.add(emp8);
		
		List<Employee> employeeList1 = new ArrayList<>(employees);
		List<Employee> employeeList2 = new ArrayList<>(employees);
		
		System.out.println("BEFORE Employee List is sorted:\n   " + employees + "\n");
		
		
		/*
		 * Sorting a Collection BEFORE Java 1.8
		 */
		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee emp1, Employee emp2) {
				return emp1.getFirstName().compareTo(emp2.getFirstName());
			}
		});
		
		
		/*
		 * Java 1.8 - Pattern 1  (no overridden method is required)
		 */
		employeeList1.sort((employee1, employee2) ->  employee1.getFirstName()
				.compareTo(employee2.getFirstName())
			);
		
		/*
		 * Java 1.8 - Pattern 2  (even more compressed!)
		 */
		employeeList2.sort(comparing(Employee::getFirstName));
		
		
		/*
		 * Now output it to the console!
		 */
		System.out.println("Sorted original Employee List using pre-Java 8 Comparator:\n   " + employees + "\n");
		System.out.println("Using Java 1.8 sort-> a stable, adaptive, iterative mergesort:\n   " + employeeList1 + "\n");
		System.out.println("Using Java 1.8 sort (pattern 2) to sort second employee list:\n   " + employeeList2 + "\n");
		
	}
	
}
