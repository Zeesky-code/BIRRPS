package com.BIRRPS;

public class Payment {
	double amount;

	public Payment(double amount) {
		this.amount = amount;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount= amount;
	}

	public void paymentDetails() {
		System.out.println("The payment amount is = "+this.amount);
	}
}
