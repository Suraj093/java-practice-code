package day.five;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataStreamExample {
	
	public static void main(String[] args) throws IOException {
		
		
		try {
			FileInputStream fInput = new FileInputStream("D:\\git\\demo.txt");
			int read = fInput.read();
			System.out.println((char)read);
			fInput.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
