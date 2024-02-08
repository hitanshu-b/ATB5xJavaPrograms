package src.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab195 {
	public static void main(String[] args) {
		Queue pq1 = new PriorityQueue();
		
		pq1.offer(10);
		pq1.offer(80);
		pq1.offer(20);
		pq1.offer(30);
		pq1.offer(40);
		pq1.offer(50);
		pq1.offer(60);
		
		System.out.println(pq1);
		System.out.println(pq1.poll());
		System.out.println(pq1);
		System.out.println(pq1.peek());
	}

}
