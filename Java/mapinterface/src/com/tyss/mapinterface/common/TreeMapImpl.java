package com.tyss.mapinterface.common;

import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapImpl {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();

		map.put(19, "JAVA");
		map.put(3, "J2EE");
		map.put(3, "HTML");
		map.put(6, "CSS");
		map.put(29, "React");
		map.put(1, "SQL");

		Set<Entry<Integer, String>> entries = map.entrySet();

		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println("------");
		}
		System.out.println(" ---- keys ----");
		Collection<Integer> collection = map.keySet();

		for (Integer integer : collection) {
			System.out.println(integer);
		}
		System.out.println(" ---- values ----");
		Collection<String> names = map.values();
		for (String name : names) {
			System.out.println(name);
		}
	}
}
