package com.testNG_Features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;



public class Ignore_Test {
	
	@Test
	private void bikes() {
		System.out.println("Two Wheeler");
	}
	@Test
	private void cars() {
		System.out.println("Four Wheeler");
	}
	@Ignore
	@Test
	private void lorry() {
		System.out.println("Six Wheeler");
	}

}
