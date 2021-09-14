package io.learning.lambda;

import java.util.Comparator;

class MySort implements Comparator<Employee> {
	//salary in descending order
	@Override
	public int compare(Employee e1, Employee e2) {
		return (int) (e2.getSalary() - e1.getSalary());
	}
}
