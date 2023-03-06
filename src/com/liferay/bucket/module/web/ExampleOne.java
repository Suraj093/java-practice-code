package com.liferay.bucket.module.web;

public class ExampleOne {

	public static void main(String[] args) {

		String str = "Suraj Kushwaha";

		StringBuffer sb = new StringBuffer();

		String[] split = str.split(" ");
		int length = split.length;

		for (int i = 0; i < length; i++) {
			sb.append(split[i]);
		}

		System.out.println(sb.toString());


	}

}
