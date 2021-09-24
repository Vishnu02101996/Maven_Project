package com.testNG_Features;

import org.testng.annotations.Test;

public class Time_Out {
	@Test(timeOut = 1000)
	private void timeTest1() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Time Test 1 successful");
	}

	@Test(timeOut = 1000)
	private void timeTest2() throws InterruptedException {
		Thread.sleep(500);
		System.out.println("Time Test 2 successful");
	}

}
