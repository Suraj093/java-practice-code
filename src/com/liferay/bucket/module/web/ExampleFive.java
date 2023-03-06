package com.liferay.bucket.module.web;

public class ExampleFive implements InterfaceExample {

	public static void main(String[] args) {

		InterfaceExample interfaceExample = new ExampleFive();

		
		int cude = interfaceExample.cude(19);
		
		System.out.println(cude);

		InterfaceExample.d();

	}

	@Override
	public void msg() {

		System.out.println("From abstract method calling...........");

	}

	@Override
	public int cude(int x) {
		// TODO Auto-generated method stub
		return x * x * x ;
	}

}
