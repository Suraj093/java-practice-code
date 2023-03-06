package com.six;

public class NumberFormat_Demo {
	
	public static void main(String[] args) {
		
		try {
			
			String str = "Anya";
			
			int x = Integer.parseInt(str);
			
		} catch (NumberFormatException n) {
			// TODO: handle exception
			System.out.println("Number Format Exception :- " + n.getMessage());
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
