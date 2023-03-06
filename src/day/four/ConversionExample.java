package day.four;

public class ConversionExample {
	
	public static void main(String[] args) {
		
		String str = "100";
		
		Integer valueOf = Integer.valueOf(str);
		
		boolean v = isNumeric(str);
		
		System.out.println("Integer value " + valueOf);
		
		System.out.println("Integer value :- " + v);
		
	}
	
    public static boolean isNumeric(String str) {
    	return str != null && str.matches("[0-9.]+");
    }

}
