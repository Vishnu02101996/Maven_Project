package com.methodoverload.org;

public class Bike {
	private void specification(String brand) {
		System.out.println("BRAND = " + brand);

	}

	private void specification(double cc) {
		System.out.println("Engine Capacity cc = " + cc);

	}

	private void specification(long price) {
		System.out.println("Price = Rs." + price);

	}

	public static void main(String[] args) {
		System.out.println("Bike Specification");
		Bike a = new Bike();
		a.specification("Yamaha FZ");
		a.specification(149.5);
		a.specification(110000);
	}
}
