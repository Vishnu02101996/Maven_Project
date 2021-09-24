package com.constructor.org;

public class Exam {
	public Exam(String name) {
		System.out.println("Exam Nmae:" + name);
	}

	public Exam(double time) {
		System.out.println("Exam Time:" + time + "am");
	}

	private void venue(String place) {
		System.out.println("Exam Venue:" + place);

	}

	public Exam(int id) {
		System.out.println("POST ID:" + id);
		this.venue("Chennai");
	}

	public static void main(String[] args) {
		System.out.println("Recruitment Notification");
		Exam a2 = new Exam("RRB Junior Engineer");
		Exam a = new Exam(10.45);
		Exam a1 = new Exam(5564);

	}

}
