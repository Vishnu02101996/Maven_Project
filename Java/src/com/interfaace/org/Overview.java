package com.interfaace.org;

public class Overview implements Systemsoftwares {

	@Override
	public void whatsapp(String name) {
		System.out.println("Communication by text and voice:" + name);
		this.google("Google");
	}

	@Override
	public void google(String name) {
		System.out.println("Search engine:" + name);
		this.catia("Catia");
	}

	@Override
	public void catia(String name) {
		System.out.println("Design software:" + name);
		this.photoshop("Adobe Photoshop");
	}

	@Override
	public void photoshop(String name) {

		System.out.println("Photo editing and Manipulation:" + name);
	}

	public static void main(String[] args) {
		System.out.println("Apps and Softwares");
		Overview a = new Overview();
		a.whatsapp("Whatsapp");
	}

}
