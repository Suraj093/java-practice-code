package com.nine;

import java.util.function.Predicate;

public class SE1EP012 {

	public static void main(String[] args) {
		
		Predicate<Integer> greaterThan18 = i -> (i > 18);
		
		Predicate<Integer> lowerThan50 = k -> (k < 50);
		
		if(greaterThan18.and(lowerThan50).test(49)) {
			System.out.println("You are eligible for vacation");
		}else {
			System.out.println("You are not eligible for vacation");
		}
		
	}
	
}
