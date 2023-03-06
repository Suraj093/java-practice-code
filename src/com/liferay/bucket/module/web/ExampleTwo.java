package com.liferay.bucket.module.web;

public class ExampleTwo {

	public static void main(String[] args) {

		// trim(), strip(), stripIndent(), stripLeading(), stripTrailing();

		String url = "Suraj      Kushwaha";

		String replaceAll = url.replaceAll("\\s", "");

		System.out.println(replaceAll);

	}

}
