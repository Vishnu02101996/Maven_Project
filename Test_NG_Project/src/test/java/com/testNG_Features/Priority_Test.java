package com.testNG_Features;

import org.testng.annotations.Test;

public class Priority_Test {
	@Test(priority = 2)
	private void payment() {
		System.out.println("Complete any payment mode");
	}

	@Test
	private void addProduct() {
		System.out.println("Add product into cart");
	}

	@Test(priority = -1)
	private void search() {
		System.out.println("Search your Product");
	}

	@Test(priority = -2)
	private void login() {
		System.out.println("Login Your Account");
	}

	@Test(priority = 1)
	private void address() {
		System.out.println("Choose your delivery address");
	}

}
