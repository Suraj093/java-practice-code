package com.six;

public class StringIndexOutOfBound_Demo {
	
	public static void main(String[] args) {
		
		try {
			
			String str = "Anya";
			System.out.println(str.charAt(2));
			
		} catch (StringIndexOutOfBoundsException s) {
			// TODO: handle exception
			System.out.println(s.getMessage());
			s.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
