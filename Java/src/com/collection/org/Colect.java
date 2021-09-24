package com.collection.org;


import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


public class Colect {

	public static void main(String[] args) {
		List<String> a=new ArrayList<String>();
		a.add("hi");
		a.add("how");
		a.add("are");
		a.add("you");
		System.out.println(a);
		int i = a.size();
		System.out.println(i);
		
			for (int j = 0; j < a.size(); j++) {
				System.out.println(a.get(j));
		
			}
			for (Object ref : a) {
				System.out.println(ref);
			}
			List<Object> b=new Vector<Object>();
			
	}

	}


