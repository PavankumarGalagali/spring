package com.tyss.collectionimpl.mycollection;

import java.util.Iterator;

public class ArrayListTest {
	public static void main(String[] args) {
		
		MyArray<Integer> array = new MyArray<Integer>();
		array.add(10);
		array.add(20);
		array.add(30);
		array.add(40);
		array.add(50);
		array.add(60);
//		System.out.println(array);
//		
//		for(Object integer: array) {
//			System.out.println(integer);
//		}
	
	Iterator<Integer> iterator = array.iterator();
	System.out.println(iterator.getClass());
	while (iterator.hasNext()) {
		Integer integer = (Integer) iterator.next();
		System.out.println(integer);
	}
	}
}
