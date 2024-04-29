package com.jsp.collections;

import java.util.PriorityQueue;

public class P19 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for (int i = 0; i <= 15; i++) {
			if (i % 2 != 0) {
				pq.add(i);
			}
		}

		System.out.println("Elements of the PriorityQueue:");

		for (int item : pq) {
			System.out.println(item);
		}
	}

}
