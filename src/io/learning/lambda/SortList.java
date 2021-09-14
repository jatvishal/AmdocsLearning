package io.learning.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		List<Employee>employees = new ArrayList<Employee>();
		employees.add(new Employee(10,"Ramesh",30,40000));
		employees.add(new Employee(30,"vishal",39,47000));
		employees.add(new Employee(20,"rahul",32,43000));
		employees.add(new Employee(50,"vishesh",20,90000));
		employees.add(new Employee(40,"rupa",24,48000));
		employees.add(new Employee(70,"kedar",26,30000));
		employees.add(new Employee(60,"sudiksha",27,98000));
		employees.add(new Employee(80,"Nikita",28,48000));
		
		Collections.sort(employees, new MySort());
		
		System.out.println(employees);
	}
}
