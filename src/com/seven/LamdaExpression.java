package com.seven;

public class LamdaExpression {
	
	public static void main(String[] args) {
		
		InterfaceOne interf = s -> s.length();
		
		int length = interf.getLength("Suraj Kushwaha");
		
		System.out.println("Length of string :- " + length);
		
		System.out.println("---------------------------------------");
		
        InterfaceTwo message = msg -> msg;
		
		String message2 = message.getMessage("Suraj Kushwaha");
		
		System.out.println("Welcome Back :- " + message2);
		
		System.out.println("---------------------------------------");
		
		AddTwoNumber addNumber = (a, b) -> {
			return a + b;
		};
		
		double addNumber2 = addNumber.addNumber(100, 1000);
		
		System.out.println("Addtion of two number :- " + addNumber2);
		
	}

}
