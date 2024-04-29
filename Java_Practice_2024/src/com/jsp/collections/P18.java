package com.jsp.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class P18 {

	public static void main(String[] args) {
		Map<String, Integer> scores = new HashMap<>();
		scores.put("Alice", 95);
		scores.put("Bob", 80);
		scores.put("Charlie", 75);
		scores.put("Diana", 90);

		printMapUsingIterator(scores);
	}

	public static void printMapUsingIterator(Map<String, Integer> map) {
		Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
	}

}
