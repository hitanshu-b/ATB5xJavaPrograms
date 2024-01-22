package src.oops_5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab184 {

	public static void main(String[] args) {
		
		List<String> mylist = new LinkedList();
		//Collection stringList = new ArrayList();
		mylist.add("Rames");
		mylist.add("Suresj");
		
		List<Integer> numlist = new LinkedList<Integer>();
		numlist.add(123);
		numlist.add(321);
		numlist.add(1234);
		
		Iterator i = numlist.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
