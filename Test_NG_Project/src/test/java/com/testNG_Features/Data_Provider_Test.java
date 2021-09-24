package com.testNG_Features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_Test {
	@Test(dataProvider = "test_Data")
	private void signIn(String email, String password) {
		System.out.println("Enter Email: " + email);
		System.out.println("Enter Password: " + password);
		System.out.println("Click Signin Button");
	}

	@DataProvider
	private Object[][] test_Data() {
		return new Object[][] { { "a2b@yahoo.com", "A2B123" }, { "kfc@gmail.com", "KFCh345" },
				{ "dominos@gmail.com", "DOMINOS567" } };
	}
}
