package com.eight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student {
	int studentId;
	String studentName;
	String address;

	public Student() {
	}

	public Student(int studentId, String studentName, String address) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.address = address;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "studentId=" + studentId + ", studentName=" + studentName + ", address=" + address + "";
	}

}

public class ExampleThree {

	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(102398, "Suraj", "Ghazipur"));
		studentList.add(new Student(230894, "Amit", "Ghazipur"));
		studentList.add(new Student(450982, "Komal", "Delhi"));
		studentList.add(new Student(650231, "Pintu", "Ghazibad"));

		System.out.println("Student List :- " + studentList);
		
		System.out.println("-----------------------------------------");
		
		MyCompareClass sortList = new MyCompareClass();
		
		Collections.sort(studentList,sortList);
		
		System.out.println("Student List :- " + studentList);

	}

}
