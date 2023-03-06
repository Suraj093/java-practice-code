package day.four;

public class ExceptionExampleOne {
	
	public static void main(String[] args) {
		
		try {
			
			int x = 100/10;
			System.out.println(x);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error " + e);
		}
		
		System.out.println("Code after error........");
		
	}

}
