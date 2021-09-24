package com.variabledeclare.org;

public class Variables {
	String name1,name2;
	double ppl1,ppl2;

	public Variables(String Petrol, String Diesel) {
		name1 = Petrol;
		name2 = Diesel;
	}

	private void price(double rate, double Drate) {
		ppl1 = rate;
		ppl2 = Drate;

	}

	private void details() {
		System.out.println("News1:" + name1);
		System.out.println("Price per litre:" + ppl1);
		System.out.println("News2:" + name2);
		System.out.println("Price per litre:" + ppl2);

	}

	public static void main(String[] args) {
		System.out.println("          July 6th");
		Variables list = new Variables("Petrol price in Chennai", "Diesel price in Chennai");
		list.price(100.75, 93.91);
		list.details();
	}
}
