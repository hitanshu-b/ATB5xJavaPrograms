package src.collections;

import java.util.Set;
import java.util.HashSet;

public class Lab192 {
	
	public static void main(String[] args) {
		
		Set courseSet = new HashSet();
		courseSet.add("Devops");
		courseSet.add("MTB");
		courseSet.add("ATB");
		courseSet.add("SDET");
		courseSet.add("PyTB");
		
		System.out.println(courseSet);
		for(Object o : courseSet) {
			System.out.println(o);
		}
	}

}
