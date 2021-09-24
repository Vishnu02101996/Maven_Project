package com.exception.org;

public class Testthrow {

	public static void main(String[] args) {
		Testthrow s = new Testthrow();
		try {
			s.Test1(30, 0);
		} catch (Exception e) {
			System.out.println("We cannot divide an integer by zero");

			// e.printStackTrace();
		}

	}

	public void Test1(int a, int b) throws Exception {
		if (b == 0) {

			System.out.println("The denominator value is zero");
			throw new ArithmeticException();
		} else {
			int c = a / b;
			System.out.println(c);
		}
	}

}
