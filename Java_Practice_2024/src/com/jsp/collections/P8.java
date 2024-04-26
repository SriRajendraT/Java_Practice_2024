package com.jsp.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class P8 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i <= 5; i++) {
			list.add(i);
		}

		System.out.println("Original Array List " + list);

		HashSet<Integer> set = new HashSet<Integer>(list);

		System.out.println("Copy Hash set " + set);
	}

}
