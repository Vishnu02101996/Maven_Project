package com.forloop.org;

import java.util.Scanner;

public class Looping {
	public static void main(String[] args) {
		System.out.println("Reverse Pattern");
		looping_P();
	}

	private static void looping_P() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int row = s.nextInt();
		for (int i = 0; i <= row - 1; i++) {
			for (int j = row - 1; j >= i; j--) {
				System.out.print("*");

			}

			System.out.println();

		}

		s.close();

	}

}
