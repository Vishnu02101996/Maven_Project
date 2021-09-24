package com.testNG_Features;

import org.testng.annotations.Test;

public class Invocation_Count {
	int i=1;
	@Test(invocationCount = 4)
	private void iterator() {
		System.out.println("count: " + i++);
	}

}
