package com.liferay.bucket.practice.classes;

public class ExtendsImplementationClass implements InterfaceExample {

	@Override
	public String getName() {
		// TODO Auto-generated method stub

		String defaultName = "Suraj Kushwaha";

		String userName = null;

		if (defaultName != null) {
			userName = "Suman Kushwaha";
		} else {
			userName = defaultName;
		}
		return userName;
	}
}
