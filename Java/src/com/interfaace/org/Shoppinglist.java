package com.interfaace.org;

public class Shoppinglist implements Garments, Styles {

	@Override
	public void item1() {
		System.out.println("Watch");

	}

	@Override
	public void item2() {
		System.out.println("Shoes");

	}

	@Override
	public void item3() {
		System.out.println("Coolers");

	}

	@Override
	public void cloth1() {
		System.out.println("Shirt");
	}

	@Override
	public void cloth2() {
		System.out.println("Pants");
	}

	@Override
	public void cloth3() {
		System.out.println("Inners");

	}

	public static void main(String[] args) {
		System.out.println("Shopping List");
		Shoppinglist a = new Shoppinglist();
		a.cloth1();
		a.cloth2();
		a.cloth3();
		a.item1();
		a.item2();
		a.item3();

	}

}
