package day.four;

public class CheckNullOrEmpty {

	public static void main(String[] args) {

		String str = "Anya Kushwaha";

		if (str == null || str.isBlank()) {

			System.out.println("Enter a valid string");

		} else {

			for (int i = 0; i < str.length(); i++) {

				if (str.charAt(i) == ' ') {

					continue;

				}

				System.out.println("String value :- " + str.charAt(i));
			}
		}

	}

}
