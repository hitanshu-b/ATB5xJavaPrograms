package src.oops_5;

import java.io.File;
import java.io.FileReader;

public class Lab175 {
	public static void main(String[] args) {
		int a = 10/0; // unchecked exception
		
		try {
			FileReader f = new FileReader(new File("C://a.txt"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
