package com.methotoverride.org;
public class Class2 extends Class1 {
	String Name = "Shatabdi";
	int Number = 12007;

	@Override
	public void trainSchedule() {
		super.trainSchedule();
		super.trainNumber();
		System.out.println("2nd Train Name:" + Name);
		this.trainNumber();
	}

	@Override
	public void trainNumber() {
		System.out.println("2nd Train Number:" + Number);
		this.travelDay("Full AC");
	}
    public void travelDay(String Type) {
		System.out.println("Train Type:" + Type);
		this.travelDay(12);

	}
    public void travelDay(int Hour) {
		System.out.println("Travel Hours:" + Hour);

	}
    public static void main(String[] args) {
		System.out.println("Train Schedule");
		Class2 t = new Class2();
		t.trainSchedule();
    }

}
