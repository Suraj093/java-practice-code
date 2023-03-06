package com.liferay.bucket.module.web;

public class ExampleThree {

	public static void main(String[] args) {

		String newStr = "  Lorem Ipsum is simply dummy text";
		// String newStr = str.replaceAll("\\s", "");
		extracted(newStr);

	}

	private static void extracted(String newStr) {
		for (int i = 0; i < newStr.length(); i++) {

			char c = newStr.charAt(i);

			if (c == ' ') {
				continue;
			} else {
				System.out.print(newStr.charAt(i));
			}

		}
	}

}
