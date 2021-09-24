package com.armstrong.org;

import java.util.Scanner;

public class Amstr {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = s.nextInt();
		 
			int a, b = 0, c = 0;
			a = num;
			while (a > 0) {
				b = a % 10;
				c = c + (b * b * b);
				a = a / 10;
			}
			if (num == c) {
				System.out.println("The entered number is Amstrong number");
			} else {
				System.out.println("The entered number is not an Amstrong number");
			}

		
		s.close();
	}
	}


