package com.superr.org;

public class Fitband2 extends Fitband1 {
	String Bandname = "OnePlus Band";

	@Override
	public void price() {
		System.out.println("Price of " + Bandname + " is Rs.2599");
		super.price();
	}

	private void features() {
		System.out.println( Bandname + " : SPO2 is Available");
		System.out.println(super.Bandname + " : SPO2 is not Available");

	}

	public static void main(String[] args) {
		Fitband2 b = new Fitband2();
		b.price();
		b.features();
	}

}
