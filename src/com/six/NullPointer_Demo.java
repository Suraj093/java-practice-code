package com.six;

public class NullPointer_Demo {

	public static void main(String[] args) {

		try {
			String str = null;
			System.out.println(str.length());
		} catch (NullPointerException n) {
			// TODO: handle exception
			System.out.println(n.getMessage());
			n.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		System.out.println("Outside of try catch blog code....");

	}

}
