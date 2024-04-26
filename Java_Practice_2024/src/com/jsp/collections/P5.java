package com.jsp.collections;

import java.util.ArrayList;

public class P5 {

	public static void main(String[] args) {
		ArrayList<Integer> oList = new ArrayList<Integer>();
		for (int i = 1; i <= 5; i++) {
			oList.add(i);
		}

		System.out.println("Original Array List " + oList);

		ArrayList<Integer> nList = new ArrayList<Integer>();

		for (int i = 0; i < oList.size(); i++) {
			nList.add(oList.get(i));
		}

		System.out.println("New Dulipact list " + nList);
	}

}
