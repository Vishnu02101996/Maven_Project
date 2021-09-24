package com.testNG_Features;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Test {

	@Test
	@Parameters({"email","password"})
	private void signIn( String email, @Optional("xyz123") String password) {
		System.out.println("Enter Email: " + email);
		System.out.println("Enter Password: " + password);
		System.out.println("Click Signin Button");
	}

}
