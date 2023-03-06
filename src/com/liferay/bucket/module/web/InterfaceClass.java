package com.liferay.bucket.module.web;

public class InterfaceClass implements NumberInterface, Principle, Principle.Another {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Suraj Kushwaha";
	}

	@Override
	public void print() {

		System.out.println("In print method..");

	}

	@Override
	public void display() {
		
		System.out.println("Calling from display method.......");
		
	}

}
