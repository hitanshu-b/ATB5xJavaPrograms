package src.collections;

import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Iterator;

public class Lab197 {
	public static void main(String[] args) {
		
		Queue<Integer> iq = new PriorityQueue<>();
		iq.add(1);
		System.out.println(iq);
		iq.poll();
		System.out.println(iq);
		
		Iterator it = iq.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+ " ");
		}
	}

}
