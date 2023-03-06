package com.nine;

interface Demo{
	
	public default void disply() {
		System.out.println("Inside static field from interface");
	}
	
}

public class SE1EP02 implements Demo{
	
	public void disply() {
		System.out.println("Inside overloading method from interface");
	}
	
	public static void main(String[] args) {
		
		SE1EP02 y = new SE1EP02();
		y.disply();
		
	}

}
