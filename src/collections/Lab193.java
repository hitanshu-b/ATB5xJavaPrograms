package src.collections;

import java.util.Set;
import java.util.TreeSet;

public class Lab193 {
	public static void main(String[] args) {
		
		Set courseSet = new TreeSet();
		courseSet.add("Devops");
		courseSet.add("MTB");
		courseSet.add("ATB");
		courseSet.add("PyTB");
		courseSet.add("SDET");
		
		System.out.println(courseSet);
	}

}
