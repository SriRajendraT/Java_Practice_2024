package com.jsp.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class P9 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(1);
		al.add(3);
		al.add(4);
		al.add(4);
		al.add(5);
		al.add(6);

		System.out.println("Original Array List " + al);

		HashSet<Integer> hs = new HashSet<Integer>(al);
		al.clear();
		al.addAll(hs);

		System.out.println("Removed Duplicates " + al);
	}

}
