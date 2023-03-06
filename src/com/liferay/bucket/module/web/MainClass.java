package com.liferay.bucket.module.web;

public class MainClass {

	public static void main(String[] args) {

		InterfaceClass interfaceClass = new InterfaceClass();
		String name = interfaceClass.getName();
		System.out.println(name);
		interfaceClass.print();
		String str = NumberInterface.str;
		System.out.println(str);
		interfaceClass.msg();
		interfaceClass.display();

	}

}
