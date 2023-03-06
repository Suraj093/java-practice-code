package day.five;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataStreamExampleDemo {
	
	public static void main(String[] args) throws IOException {
		
		try {
			FileInputStream file = new FileInputStream("D:\\git\\demo.txt");
			int i = 0;
			while((i = file.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
