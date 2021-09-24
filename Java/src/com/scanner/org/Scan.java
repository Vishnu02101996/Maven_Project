package com.scanner.org;

import java.util.Scanner;

public class Scan {
	public static void main(String[] args) {
		System.out.println("Details to be entered by student");
		Scanner s = new Scanner(System.in);

		System.out.println("Enter your Name");
		String name = s.nextLine();

		System.out.println("Enter your Gender");
		String gender = s.next();

		System.out.println("Enter your Age");
		int age = s.nextInt();

		System.out.println("Type your Mobile no");
		long number = s.nextLong();

		System.out.println("What is your CGPA?");
		double cgpa = s.nextDouble();
		System.out.println("Student Name:" + name);
		System.out.println("Gender:" + gender);
		System.out.println("Age:" + age);
		System.out.println("Mobile Number:" + number);
		System.out.println("CGPA" + cgpa);
		s.close();
	}
}
