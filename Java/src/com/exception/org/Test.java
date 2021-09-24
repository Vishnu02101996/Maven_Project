package com.exception.org;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("Enter Integer Value");
			 s.nextInt();
			System.out.println("The enetered value is Integer ");
		} catch (InputMismatchException ime) {
			System.out.println("Input is given as float " + ime);
		} finally {
			System.out.println("Verified");
		}
		s.close();

	}

}
