package com.jsp.collections;

import java.util.ArrayList;
import java.util.Collections;

public class P14 {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Mango");	
        
        System.out.println("Original ArrayList: " + arrayList);
        
        arrayList.set(1, "Grapes");
        
        System.out.println("ArrayList after replacing an element: " + arrayList);
        
        Collections.replaceAll(arrayList, "Orange", "Pineapple");
        
        System.out.println("ArrayList after replacing all occurrences of an element: " + arrayList);
	}
	
	
}
