package com.finall.org;

public final class Science {
	 final double a = 9.81, b = 3.14;

	public  final void physics() {

		System.out.println("Acceleration due to gravity g=" + a + "m/s^2");

	}

	public  final void mathematics() {
		System.out.println("Value of pi = " + b);
	}

	public static void main(String[] args) {
		System.out.println("Constant Values in Science");
		Science f=new Science();
		f.physics();
		f.mathematics();
	}

}
