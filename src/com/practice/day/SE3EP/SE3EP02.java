package com.practice.day.SE3EP;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SE3EP02 {

	public static void main(String[] args) {

		Predicate<Employee> q = t -> t.id > 2 && t.name.startsWith("A");

		Predicate<Employee> p2 = e -> e.sal < 10000;

		boolean allMatch = getEmpList().stream().allMatch(q);

		System.out.println("All Match :- " + allMatch);

	}

	public static List<Employee> getEmpList() {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "A", 2000));
		list.add(new Employee(2, "B", 3000));
		list.add(new Employee(3, "C", 4000));
		list.add(new Employee(4, "D", 5000));
		return list;
	}

}

class Employee {
	public int id;
	public String name;
	public int sal;

	public Employee(int id, String name, int sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

}
