package com.six;

public class ArrayIndexOutOfBound_Demo {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to programing world...");
		
		int[] d = {10,20,30,40,50};
	
		try {
			for(int i = 0; i < d.length; i++) {
				System.out.println("Array Element :- " + d[80]);
			}
		} catch (ArrayIndexOutOfBoundsException a) {
			// TODO: handle exception
			System.out.println(a.getMessage());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("Code after try catch blog code....");
				
	}

}
