package com.practice.org;

public class Class2 extends Class1 {

	int w = 8;

	@Override
	public void score1() {
		super.score1();
		String team2 = "ENG";
		System.out.println("Bowling:" + team2);
		this.score2();

	}

	@Override
	public void score2() {
		super.score2();
		this.wickets();
		double over = 15.3;
		System.out.println("Overs Bowled:" + over);
		System.out.println("Overs Remaining: 4.3");

	}

	private void wickets() {
		System.out.println("Wickets Remaining:" + w);

	}

	public static void main(String[] args) {
		System.out.println("Scorecard");
		Class2 b = new Class2();
		b.score1();
	}
}
