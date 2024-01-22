package src.oops_5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab182 {

	public static void main(String[] args) {
		// if we want to restrict it from entering other inputs
		
		List<String> mylist = new ArrayList<>();
		
		mylist.add("abc");
		mylist.add("vivek");
		//mylist.add(123);
		//mylist.add(true);
		
		System.out.println(mylist);
		mylist.set(1, "VivekC");
		System.out.println(mylist);
		
		for(int i=0; i<mylist.size(); i++) {
			System.out.println(mylist.get(i));
		}
		
		// ENhanced For Loop
		
		for(String o : mylist) {
			System.out.println("Enhanced: " + o);
		}
		
		System.out.println("------------");
		// Iterator Approach
		
		Iterator i = mylist.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
