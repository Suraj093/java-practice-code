package com.nine;

import java.util.function.Predicate;

public class SE1EP011 {
	
	public static void main(String[] args) {
		
		Predicate<Integer> h = g -> (g > 18);
		
		if(h.test(20)) {
			System.out.println("You are greater than your sister");
		}else {
			System.out.println("You are smaller than your sister");
		}
		
	}

}
