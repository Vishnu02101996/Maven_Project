package com.Test_NG_Project;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.helper.File_Reader_Manager;
import com.pomSdp.Page_Object_Manager;

public class Mini_Project_Dataprovider extends BaseClass1 {
	public static WebDriver driver = browserLaunch("chrome");
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	@Test(dataProvider = "test_Data")
	private void url_Credentials(String username, String password) throws Throwable {
		driver.manage().deleteAllCookies();
		String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
		getURL(url);
		clickOnElement(pom.getInstanceHp().getSignin_Btn());
		waitSec(10);
		inputValues(pom.getInstanceSp().getUsername(), username);
		inputValues(pom.getInstanceSp().getPassword(), password);
		clickOnElement(pom.getInstanceSp().getSignin_Btn());

	}

	@DataProvider
	private Object[][] test_Data() {
		return new Object[][] { { "vishnu2101996@gmail.com", "Fzrider02" },
				{ "shreekanth1000@yahoo.co.in", "asdfghjkl" }

		};
	}

	@Test(priority = 1)
	private void login() throws InterruptedException {
		waitSec(20);

		clickOnElement(pom.getLogout().getSignOut());
		sleep(6000);

	}

}
