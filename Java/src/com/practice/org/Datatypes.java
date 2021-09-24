package com.practice.org;

public class Datatypes {
	private void data() {
		System.out.println("Data Types");
		this.data('J');

	}
	private void data(char c) {
		System.out.println("Character:" + c);
		this.data(2021);
	}
	private void data(int i) {
	  System.out.println("Interger:" + i);
	  this.data("Java");

	}
	private void data(String s) {
		System.out.println("String:" + s);
		this.data(1.8);

	}
	private void data(double d) {
		System.out.println("Double:" + d);

	}
	public static void main(String[] args) {
		Datatypes a=new Datatypes();
		a.data();
	}
}
