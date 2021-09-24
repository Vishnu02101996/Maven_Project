package com.testNG_Features;

import org.testng.annotations.Test;

public class Grouping_Test {

	@Test(groups = "Gadgets")
	private void laptops() {
		System.out.println("Laptop");

	}

	@Test(groups = "Gadgets")
	private void mobiles() {
		System.out.println("Mobile");
	}

	@Test(groups = "Household Appliances")
	private void washing_Machines() {
		System.out.println("Washing Machine");
	}

	@Test(groups = "Household Appliances")
	private void microwave_Oven() {
		System.out.println("Microwave Oven");
	}

	@Test(groups = "Music")
	private void gaana() {
		System.out.println("Gaana");
	}

	@Test(groups = "Music")
	private void wynk() {
		System.out.println("Wynk");
	}

}
