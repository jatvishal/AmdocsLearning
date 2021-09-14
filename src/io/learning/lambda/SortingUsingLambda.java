package io.learning.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingUsingLambda {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(10, "Ramesh", 30, 40000));
		employees.add(new Employee(30, "vishal", 39, 47000));
		employees.add(new Employee(20, "rahul", 32, 43000));
		employees.add(new Employee(50, "vishesh", 20, 90000));
		employees.add(new Employee(40, "rupa", 24, 48000));
		employees.add(new Employee(70, "kedar", 26, 30000));
		employees.add(new Employee(60, "sudiksha", 27, 98000));
		employees.add(new Employee(80, "Nikita", 28, 48000));

		Collections.sort(employees, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return (int) (e1.getName().compareTo(e2.getName()));
			}
		});
		Collections.sort(employees, (e1, e2) -> (e1.getName().compareTo(e2.getName())));
		System.out.println("Ascending order => " + employees);
		Collections.sort(employees, (e1, e2) -> (e2.getName().compareTo(e1.getName())));
		System.out.println("Descending order => " + employees);
	}
}

//class MySort implements Comparator<Employee> {
//
//	@Override
//	public int compare(Employee e1, Employee e2) {
//		return (int) (e1.getSalary() - e2.getSalary());
//	}
//}
