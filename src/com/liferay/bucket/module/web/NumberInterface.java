package com.liferay.bucket.module.web;

public interface NumberInterface extends Principle{

	default void msg() {
		System.out.println("Default Method....");
	}
	
	public void print();

}
