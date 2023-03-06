package com.nine;

class Person {
	int age;
	String name;

	Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
}

class Student extends Person {

	int id;
	int marks;

	Student(int age, String name, int id, int marks) {
		super(age, name);
		this.id = id;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", marks=" + marks + ", age=" + age + ", name=" + name + "]";
	}

}

public class SE1EP017 {

	public static void main(String[] args) {

		Student obj = new Student(20, "Suraj", 101, 60);

		System.out.println(obj);

	}

}
