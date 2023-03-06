package com.nine;

import java.io.File;
import java.io.IOException;

public class SE1EP010 {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("D:\\file\\contact.txt");
		
		f.createNewFile();
		
		boolean checkExists = f.exists();
		
		if(checkExists) {
			System.out.println("File exit");
		}else {
			System.out.println("File not exit");
		}
		
	}
	
	

}
