package com.pomSdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page_Object_Manager {
	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver driver;

	private Homepage hp;

	public Homepage getInstanceHp() {
		hp = new Homepage(driver);
		return hp;
	}

	public Signinpage getInstanceSp() {
		sp = new Signinpage(driver);
		return sp;
	}

	private Signinpage sp;

	private Homepage1 hp1;

	public Homepage1 getHp1() {
		hp1 = new Homepage1(driver);
		return hp1;
	}

	public Eveningdress getEp() {
		ep = new Eveningdress(driver);
		return ep;
	}

	public Cartpage getCp() {
		cp = new Cartpage(driver);
		return cp;
	}

	public SummaryPage getSp() {
		Sp = new SummaryPage(driver);
		return Sp;
	}

	public Addresspage getAp() {
		ap = new Addresspage(driver);
		return ap;
	}

	public Shippingpage getShip() {
		ship = new Shippingpage(driver);
		return ship;
	}

	public Paymentmodepage getPm() {
		pm = new Paymentmodepage(driver);
		return pm;
	}

	public PaymentConfirmPage getPc() {
		pc = new PaymentConfirmPage(driver);
		return pc;
	}

	public Signoutpage getLogout() {
		logout = new Signoutpage(driver);
		return logout;
	}

	private Eveningdress ep;
	private Cartpage cp;
	private SummaryPage Sp;
	private Addresspage ap;
	private Shippingpage ship;
	private Paymentmodepage pm;
	private PaymentConfirmPage pc;
	private Signoutpage logout;

}
