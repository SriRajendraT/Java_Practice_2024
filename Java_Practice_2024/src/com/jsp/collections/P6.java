package com.jsp.collections;

import java.util.PriorityQueue;

public class P6 {

	public static void main(String[] args) {
		PriorityQueue<Integer> oQueue = new PriorityQueue<Integer>();
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				oQueue.add(i);
			}
		}

		System.out.println("Original Queue 1 " + oQueue);

		PriorityQueue<Integer> nQueue = new PriorityQueue<Integer>();

		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				nQueue.add(i);
			}
		}

		System.out.println("Original Queue 2 " + nQueue);

		while (!oQueue.isEmpty()) {
			nQueue.add(oQueue.poll());
		}

		System.out.println("Combind Queue 1 & 2 " + nQueue);
	}

}
