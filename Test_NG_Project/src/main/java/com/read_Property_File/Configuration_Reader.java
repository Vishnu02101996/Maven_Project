package com.read_Property_File;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;

	public Configuration_Reader() throws Throwable {

		File f = new File(
				"C:\\Users\\WELCOME\\eclipse-workspace\\Test_NG_Project\\src\\main\\java\\com\\properties\\Configuration1.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);

	}

	public String getBrowser() {

		String browser = p.getProperty("browser");
		return browser;
	}

	public String getUrl() {

		String url = p.getProperty("url");
		return url;
	}

	public String userName() {

		String username = p.getProperty("username");
		return username;
	}

	public String passWord() {

		String password = p.getProperty("password");
		return password;
	}

	public String mobileSearch() {

		String search1 = p.getProperty("searchbar1");
		return search1;
	}

	public String laptopSearch() {

		String search2 = p.getProperty("searchbar2");
		return search2;
	}

	public String screenShotMobile() {

		String scrShot1 = p.getProperty("screenshot1");
		return scrShot1;
	}

	public String screenShotLaptop() {

		String scrShot2 = p.getProperty("screenshot2");
		return scrShot2;
	}

}
