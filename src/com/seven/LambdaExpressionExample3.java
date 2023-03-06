package com.seven;

@FunctionalInterface
interface SayHello{
	
	public String sayHello();
	
}

public class LambdaExpressionExample3 {
	
	public static void main(String[] args) {
		
		SayHello hello = () ->{
			return "You are too good";
		};
		
		String sayHello = hello.sayHello();
		
		System.out.println(sayHello);
	}

}
