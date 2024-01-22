package src.oops_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab173 {
	public static void main(String[] args) throws Exception {
		
		readFile("C://hits.txt");
		
	}
	
	
	static void readFile(String fileName) throws Exception {
		File f = new File(fileName);
		FileReader fr = new FileReader(fileName);
		if(fileName.length() == 0) {
			throw new FileNotFoundException();
		}
		System.out.println("Not a Vulnerable code");
	}

}
