package com.examples.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterEx {

	public static void main(String a[]) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Nataraja G", "Accounts", 8000));
		empList.add(new Employee("Nagesh Y", "Admin", 15000));
		empList.add(new Employee("Vasu V", "Security", 2500));
		empList.add(new Employee("Amar", "Entertinment", 12500));

		// find employees whose salaries are above 10000
		// empList.stream().filter(emp->emp.getSalary() >
		// 10000).forEach(System.out::println);
		List empList1 = empList.stream().filter(emp -> emp.getSalary() > 10000).map(emp -> emp.getName())
				.collect(Collectors.toList());
		System.out.println(empList1);
		System.out.println();
		List<Employee> empList2 = empList.stream().filter(emp -> emp.getAccount().equalsIgnoreCase("Admin"))
				.collect(Collectors.toList());
		System.out.println(empList2);
		System.out.println();
		empList.stream().sorted((emp1, emp2) -> emp2.getSalary().compareTo(emp1.getSalary()))
				.forEach(System.out::println);
		System.out.println();
		empList.stream().sorted((emp1, emp2) -> emp1.getName().compareTo(emp2.getName())).forEach(System.out::println);

	}

}