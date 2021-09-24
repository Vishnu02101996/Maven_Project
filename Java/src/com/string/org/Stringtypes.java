package com.string.org;

public class Stringtypes {
	public static void main(String[] args) {
		// Immutable
		// when we have a duplicate value it will share the memory
		// when we concatenate it will create a new memory
		String a = "Beast";
		String b = "Beast";
		String c = "Valimai";
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(c));

		String d = a.concat(b);
		System.out.println(d);
		System.out.println(System.identityHashCode(d));
		
		System.out.println(a);

		// Mutable
		// When we have a duplicate value it will create a new memory
		// When we append it will share the memory
		System.out.println("Mutable");

		StringBuffer i = new StringBuffer("Beast");
		StringBuffer j = new StringBuffer("Beast");
		StringBuffer k = new StringBuffer("Valimai");

		System.out.println(System.identityHashCode(i));
		System.out.println(System.identityHashCode(j));
		System.out.println(System.identityHashCode(k));

		StringBuffer l = i.append(j);
		System.out.println(l);
		System.out.println(System.identityHashCode(l));
		
		System.out.println(i);

	}
}
