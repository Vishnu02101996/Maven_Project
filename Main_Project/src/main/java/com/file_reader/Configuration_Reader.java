package com.file_reader;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;

	public Configuration_Reader() throws Throwable {
		File f = new File(
				"C:\\Users\\WELCOME\\eclipse-workspace\\Main_Project\\src\\main\\java\\com\\properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
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

	public String getUsername() {
		String username = p.getProperty("db_Username");
		return username;
	}

	public String getPassword() {
		String password = p.getProperty("db_Password");
		return password;
	}

	public String getFirstname() {
		String firstname = p.getProperty("first_Name");
		return firstname;
	}

	public String getLastname() {
		String lastname = p.getProperty("last_Name");
		return lastname;
	}

	public String getAddress() {
		String address = p.getProperty("address");
		return address;
	}

	public String getCardno() {
		String cardno = p.getProperty("card_No");
		return cardno;
	}

	public String getCvv() {
		String cvv = p.getProperty("cvv");
		return cvv;
	}

	public String getScrshot() {
		String scrShot = p.getProperty("screenShot");
		return scrShot;
	}

}
