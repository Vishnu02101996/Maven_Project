package com.palindrome.org;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		int a,b=0,c=0;
		Scanner p = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = p.nextInt();
		a = num;
		while (a > 0) {
			b = a % 10;
			c = (c * 10) + b;
			a = a / 10;

		}
		if (num == c) {
			System.out.println("Entered number is palindrome");
		} else {
			System.out.println("Entered number is not a palindrome");
		}
		p.close();
		
	}

}
