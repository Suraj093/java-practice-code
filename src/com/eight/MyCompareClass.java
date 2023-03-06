package com.eight;

import java.util.Comparator;

public class MyCompareClass implements Comparator<Student>{

	@Override
	public int compare(Student obj1, Student obj2) {
		// TODO Auto-generated method stub
		
		int compareTo = obj1.getStudentName().compareTo(obj2.getStudentName());
		
		return compareTo;
	}

	

}
