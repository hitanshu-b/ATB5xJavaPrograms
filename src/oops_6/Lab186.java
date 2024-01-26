package src.oops_6;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.List;

public class Lab186 {
	
	public static void main(String[] args) {
		
		List ls = new ArrayList();
		ls.add("Real Madrid");
		ls.add("Madrid");
		ls.add("Only Madrid");
		ls.add("Hala Madrid");
		ls.add("Manchester United");
		
		ListIterator lt = ls.listIterator(ls.size());
		while(lt.hasPrevious()) {
			System.out.println(lt.previous());
		}
		
		System.out.println("-----------");
		
		ListIterator lt1 = ls.listIterator();
		while(lt.hasNext()) {
			System.out.println(lt.next());
		}
	}

}
