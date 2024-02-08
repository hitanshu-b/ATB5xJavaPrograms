package src.collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class Lab200 {
	public static void main(String[] args) {
		Hashtable<Integer,String> h1 = new Hashtable<>();
		h1.put(1, "Real Madrid");
		h1.put(2, "Barcelona");
		h1.put(3, "Girona");
		
		Enumeration<Integer> e = h1.keys();
		while(e.hasMoreElements()) {
			int key = e.nextElement();
			System.out.println("Rank: " + key +"\t\t Name: " +h1.get(key));
		}
	}

}
