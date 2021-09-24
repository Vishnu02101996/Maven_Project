package com.testNG_Features;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Concept {
	public static String expected_Username = "ABD";
	public static String actual_Username = "Mr360";

	@Test
	private void data_Validation() {
		Assert.assertEquals(actual_Username, expected_Username);
		System.out.println("Data Validation successful");
	}

	@Test
	private void data_Verification() {
		SoftAssert s = new SoftAssert();
		s.assertEquals(actual_Username, expected_Username);
		System.out.println("Data Verification successful");
	}

}
