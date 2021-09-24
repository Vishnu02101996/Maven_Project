package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;
	public Configuration_Reader() throws Throwable {
	File f=new File(
				"C:\\Users\\WELCOME\\eclipse-workspace\\Test_NG_Project\\src\\main\\java\\com\\properties\\Configuration.properties");
	FileInputStream fis=new FileInputStream(f);	
	p=new Properties();
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
	public String getSize() {
		String size = p.getProperty("size");
		return size;
		
	}
	public String screenshot1() {
		String scrshot1 = p.getProperty("scrShot1");
		return scrshot1;
	}
	public String screenshot2() {
		String scrshot2 = p.getProperty("scrShot2");
		return scrshot2;
	}
	public String screenshot3() {
		String scrshot3 = p.getProperty("scrShot3");
		return scrshot3;
	}
	public String screenshot4() {
		String scrshot4 = p.getProperty("scrShot4");
		return scrshot4;
	}
	
}
