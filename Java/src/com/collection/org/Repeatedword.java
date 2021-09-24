package com.collection.org;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Repeatedword {

	public static void main(String[] args) {
		String s = "the sad truth is that the truth is sad";

		// FOR SPLITTING THE WORDS//
		String[] split = s.split(" ");

		// DECLARE EMPTY MAP//
		Map<String, Integer> map = new TreeMap<>();

		// ITERATE

		for (String str : split) {
			if (map.containsKey(str)) {
				Integer i = map.get(str);
				map.put(str, i + 1);

			} else {
				map.put(str, 1);

			}
			System.out.println(map);

		}
		System.out.println(map);
	

		// convert map into set to get entry value of words//
		Set<Entry<String, Integer>> entrySet = map.entrySet();

		// iterate//
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry);
			}

		}

	}

}
