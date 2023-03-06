package com.liferay.bucket.module.web;

interface InterfaceExample {
	
	public void msg();
	
	public int cude(int x);

	 default void display() {
		 System.out.println("Default method calling............");
	 }
	 
	 static void d() {
		 System.out.println("Static method calling..............");
	 }

}
