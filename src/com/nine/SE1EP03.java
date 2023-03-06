package com.nine;

interface chechkInterface{
	
	public String getName();
	
	public static void display() {
		System.out.println("Inside disply method");
	}
	
	public default void checkMessage() {
		System.out.println("Inside check message");
	}
	
}

public class SE1EP03 implements chechkInterface{
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "return value";
	}
	
	public static void main(String[] args) {
		
		SE1EP03 g = new SE1EP03();
		
		g.checkMessage();
		
		chechkInterface.display();
		
	}



}
