package com.abstraction.org;

public class Workout extends Maths {

	@Override
	public void calculation(int a, int b) {
		int x = a + b;
		int y = a - b;
		int z = a * b;
		System.out.println("Addition:" + x);
		System.out.println("Subtraction:" + y);
		System.out.println("Multiplication:" + z);

	}

	public static void main(String[] args) {
		Workout c = new Workout();
		c.calculate();
		c.calculation(10, 5);

	}

}
