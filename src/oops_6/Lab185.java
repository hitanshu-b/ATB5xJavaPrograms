package src.oops_6;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Lab185 {
	
	public static void main(String[] args) {
		//List<String> courseList = new ArrayList<>();
		ArrayList<String> courseList = new ArrayList<>();
		courseList.add("Real Madrid");
		courseList.add("Manchester United");
		courseList.add("Bournmouth");
		courseList.add("Bayern Munich");
		courseList.add("Dortmund");
		
		List numlist = new ArrayList();
		numlist.add(123);
		numlist.add(100);
		numlist.add(111);
		numlist.add(100);
		
		courseList.addAll(numlist);
		System.out.println(courseList);
		
//		for(int i=0; i<courseList.size(); i++) {
//			System.out.println(courseList.get(i));
//		}
//		
		for(Object o : courseList) {
			System.out.println(o);
		}
		
		Iterator i = courseList.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
