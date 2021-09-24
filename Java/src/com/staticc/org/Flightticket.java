package com.staticc.org;

public class Flightticket {
	static String flight = "IndiGo", From = "Jaipur", Destination = "Kolkata";
	static int number = 6237;
	static double t = 22.45;
	static {
		System.out.println("Flight ticket status");
		System.out.println("Departure time:" + t);
	}

	public static void passenger() {
		String p1 = "Vishnu";
		String p2 = "Vishal";
		System.out.println("Passenger 1:" + p1);
		System.out.println("Passenger 2:" + p2);
	}

	public static void seatnumber() {
		int a = 47, b = 48;

		System.out.println("Seat no of Passenger1:" + a);
		System.out.println("Seat no of Passenger2:" + b);
	}

	public static void reschedule() {
		t = 23.45;
		System.out.println("Rescheduled departure time:" + t);
	}

	public static void main(String[] args) {
		System.out.println("Flight name:" + flight);
		System.out.println("Flight number:" + number);
		System.out.println("From:" + From);
		System.out.println("Destination:" + Destination);
		passenger();
		seatnumber();
		reschedule();
	}

}
