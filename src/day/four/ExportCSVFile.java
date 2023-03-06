package day.four;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ExportCSVFile {


	public static void main(String[] args) {

		String filePath = "D:\\git";

		boolean csvFileExit = isCSVFileExit(filePath);
		
		System.out.println("Actual Result :- " + csvFileExit);
		
		

	}

	private static boolean isCSVFileExit(String filePath) {

		boolean fileExit = false;

		if (filePath.length() == 0) {
			return false;
		}

		File f = new File(filePath);
		File[] listFiles = f.listFiles();

		if (f.isDirectory()) {
			for (File fs : listFiles) {
				if (fs.getName().endsWith(".csv")) {
					System.out.println("File found " + fs.getName());
                 fileExit = true;
				}
			}
		}

		return fileExit;

	}
	
	public static void writeDataAtOnce(String filePath)
	{
		File file = new File(filePath);

		try {
			FileWriter outputfile = new FileWriter(file,true);


			List<String[]> data = new ArrayList<String[]>();
			data.add(new String[] { "Name", "Class", "Marks" });
			data.add(new String[] { "Aman", "10", "620" });
			data.add(new String[] { "Suraj", "10", "630" });

		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
