package com.nine;

interface Kanchan {
	public void display();

	// default method
	default void show() {
		System.out.println("Default Method Executed");
	}
	
	static void showStatic() {
		System.out.println("Static Method Executed");
	}
}

class Naina implements Kanchan {

	@Override
	public void display() {
		System.out.println("You are Naina");
	}

	public void show() {
		System.out.println("Default Method Executed from Naina Class");
	}
	
	public void showStatic() {
		System.out.println("Static Method Executed from Naina Class");
	}

}

public class SE1EP018 {

	public static void main(String[] args) {

		Naina n = new Naina();
		n.display();
		n.show();
		n.showStatic();

	}

}
