package src.collections;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Lab198 {
	
	public static void main(String[] args) {
		
		Set<Integer> intSet = new HashSet<>();
		intSet.add(1232434);
		intSet.add(12324);
		intSet.add(12434);
		intSet.add(2434);
		intSet.add(32434);
		intSet.add(null);
		System.out.println(intSet);
		
		
		Set<Integer> intSet1 = new LinkedHashSet<>();
		intSet1.add(1232434);
		intSet1.add(12324);
		intSet1.add(12434);
		intSet1.add(2434);
		intSet1.add(32434);
		intSet1.add(null);
		System.out.println(intSet1);
		
		Set<Integer> intSet3 = new TreeSet<>();
		intSet3.add(1232434);
		intSet3.add(2434);
		//intSet3.add(null);
		System.out.println(intSet3);
		
		
	}

}
