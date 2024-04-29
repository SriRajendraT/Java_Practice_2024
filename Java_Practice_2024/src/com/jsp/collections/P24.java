package com.jsp.collections;

import java.util.Map;
import java.util.TreeMap;

public class P24 {

	public static void main(String[] args) {
		TreeMap<Integer, Character> list1 = new TreeMap<Integer, Character>();
		char ch = 'A';
		for (int i = 1; i <= 5; i++) {
			list1.put(i, ch);
			ch++;
		}

		System.out.println("Keys of the TreeMap:");
		printKeys(list1);
	}

	public static <K, V> void printKeys(Map<K, V> map) {
		for (K key : map.keySet()) {
			System.out.println(key);
		}
	}
}
