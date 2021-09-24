package com.array.org;

public class Class1 {

	public static void main(String[] args) {
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		int l = a.length;
		System.out.println("The length of numbers is " + l);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		int sum = 0;
		for (int j = 0; j < a.length; j++)

		{
			sum = sum + a[j];

		}
		System.out.println("The sum of the given number is " + sum);

	}

}
