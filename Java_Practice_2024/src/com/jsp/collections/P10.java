package com.jsp.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class P10 {

	public static void main(String[] args) {

		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		treeMap.put("Apple", 10);
		treeMap.put("Banana", 20);
		treeMap.put("Orange", 15);
		treeMap.put("Mango", 25);

		System.out.println("TreeMap " + treeMap);

		Iterator<Map.Entry<String, Integer>> iterator = treeMap.entrySet().iterator();

		System.out.println("Entries from TreeMap:");

		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}

}
