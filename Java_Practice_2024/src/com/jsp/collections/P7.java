package com.jsp.collections;

import java.util.HashMap;
import java.util.Map;

public class P7 {

	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(1, "One");
		map1.put(2, "Two");
		map1.put(3, "Three");

		System.out.println("Map 1 " + map1);

		Map<Integer, String> map2 = new HashMap<>();
		map2.put(4, "Four");
		map2.put(5, "Five");
		map2.put(6, "Six");

		System.out.println("Map 2 " + map2);

		Map<Integer, String> unifiedMap = new HashMap<>(map1);
		unifiedMap.putAll(map2);

		System.out.println("Unified Map:");
		for (Map.Entry<Integer, String> entry : unifiedMap.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}

}
