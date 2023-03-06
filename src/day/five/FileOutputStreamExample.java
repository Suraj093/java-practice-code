package day.five;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
	
	public static void main(String[] args) throws IOException {
		
		try {
			FileOutputStream fout = new FileOutputStream("D:\\git\\demo.txt");
			String str = "Suraj Kushwaha";
			byte[] bytes = str.getBytes();
			fout.write(bytes);
			fout.close();
			System.out.println("Success");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
