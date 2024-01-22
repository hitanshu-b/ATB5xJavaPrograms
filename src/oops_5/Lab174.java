package src.oops_5;

import java.io.File;
import java.io.FileReader;

public class Lab174 {
	public static void main(String[] args) throws Exception{
		main("hits");
	}
	
	static void main(String s) throws Exception{
		
		
		FileReader f = new FileReader(new File("C://a/txt"));
		if(s.equalsIgnoreCase("a")) {
			throw new ArithmeticException();
		}
		
	}

}
