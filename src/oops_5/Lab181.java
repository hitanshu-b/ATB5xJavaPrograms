package src.oops_5;

import java.util.List;
import java.util.ArrayList;

public class Lab181 {
	public static void main(String[] args) {
		
		List mylist = new ArrayList();
		
		mylist.add("abc");
		mylist.add("vivek");
		mylist.add(123);
		mylist.add(true);
		
		System.out.println(mylist);
		mylist.set(1, "VivekC");
		System.out.println(mylist);
		
		for(int i=0; i<mylist.size(); i++) {
			System.out.println(mylist.get(i));
		}
		
		// ENhanced For Loop
		
		for(Object o : mylist) {
			System.out.println("Enhanced: " + o);
		}
	}
}
