package org.single.in;

public class BankDetails extends AxisBank {
	public void saving() {
		System.out.println("5000");
	}

	public void fixed() {
		System.out.println("80000");
	}
	public static void main(String[] args) {
		BankDetails b=new BankDetails();
		b.saving();
		b.fixed();
		b.deposit();
	}
}
