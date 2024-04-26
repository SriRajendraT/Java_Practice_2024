package com.jsp.collections;

import java.util.Collections;
import java.util.LinkedList;

public class P4 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 1; i <= 5; i++) {
			list.add(i);
		}

		System.out.println("Original List " + list);

		Collections.reverse(list);

		System.out.println("reversed List " + list);
	}

}
