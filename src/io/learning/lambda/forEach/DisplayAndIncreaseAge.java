package io.learning.lambda.forEach;

import java.util.ArrayList;
import java.util.List;

public class DisplayAndIncreaseAge {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(10, "vishal", 23, 43000));
		employees.add(new Employee(20, "akash", 21, 47000));
		employees.add(new Employee(10, "ravi", 76, 33000));
		employees.add(new Employee(10, "isha", 14, 53000));
		employees.add(new Employee(10, "vikram", 18, 93000));
		employees.add(new Employee(10, "jay", 29, 40000));

//		for (Employee s : employees) {
//			System.out.print(s.getAge()+" ");
//		}
		
		employees.stream()
//		.filter((s) -> (s.getAge()>50))
		.forEach((s)->{
			s.setAge(s.getAge()+1);
			System.out.printf("%s %s ", s.getName(),s.getAge());
			});
//		.forEach((s)->System.out.printf("%s %s ", s.getName(),s.getAge()));
	}

}
