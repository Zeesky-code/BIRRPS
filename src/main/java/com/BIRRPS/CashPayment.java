package com.BIRRPS;

public class CashPayment extends Payment{
	public CashPayment(double amount) {
		super(amount);
	}
	public void paymentDetails() {
		System.out.println("----------------------------PAYMENT WITH CASH-----------------------------");

		System.out.println(
				"The payment of Amount: $" + this.amount
						+ "\nHAS BEEN ISSUED SUCCESSFULLY ");
		System.out.println("--------------------------------------------------------------------------");
	}
}
