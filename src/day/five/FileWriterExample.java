package day.five;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	
	public static void main(String[] args) {
		
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("D:\\git\\demo.txt");
			//inherited method from java.io.OutputStreamWriter 
			fileWriter.write(65);
			fileWriter.write(66);
			fileWriter.write(67);
			fileWriter.write(68);
			fileWriter.write(69);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (fileWriter != null) {
					fileWriter.flush();
					fileWriter.close();					
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
