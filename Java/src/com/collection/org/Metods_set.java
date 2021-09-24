package com.collection.org;

import java.util.LinkedHashSet;

import java.util.Set;

public class Metods_set {

	public static void main(String[] args) {
		Set<Integer> a = new LinkedHashSet<Integer>();
		a.add(10);
		a.add(15);
		a.add(20);
		

		System.out.println(a);
		boolean empty = a.isEmpty();
		System.out.println(empty);

		int k = a.size();
		System.out.println(k);
		boolean x = a.contains(15);
		System.out.println(x);
		a.clear();
		System.out.println(a);

	}

}
