package io.learning.lambda.forEach;

import java.util.ArrayList;
import java.util.List;

public class LambdaForEach {

	public static void main(String[] args) {
		List<String>employees = new ArrayList<String>();
		employees.add("Ramesh");
		employees.add("vishal");
		employees.add("rahul");
		employees.add("vishesh");
		employees.add("rupa");
		employees.add("kedar");
		employees.add("sudiksha");
		employees.add("Nikita");
		
		for(String name:employees)
		{
			System.out.println(name);
		}
		System.out.println("\n Using for each loop\n========================================\n");
//		employees.forEach(name -> name="was there! "+name);
		for(String name:employees)
		{
			name="was there! "+name;
			System.out.println(name);
		}
//		System.out.println(employees);
	}
}
