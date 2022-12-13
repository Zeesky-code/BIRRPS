package com.BIRRPS;

public class CreditCardPayment extends Payment {
	String name;
	String expiryDate;
	String cardNumber;

	public CreditCardPayment(double amount, String name, String expiryDate, String cardNumber ) {
		super(amount);
		this.name = name;
		this.expiryDate = expiryDate;
		this.cardNumber = cardNumber;
	}
	public void paymentDetails() {
		System.out.println("-----------------------PAYMENT WITH CREDIT CARD-----------------------");
		StringBuilder builder= new StringBuilder(this.cardNumber);
		builder.replace(15,builder.length(),"****");
		System.out.println(
				"The payment of Amount: £"+ this.amount
						+ "\nby the card          : " + builder
						+ "\nwith the expiry date : " + this.expiryDate
						+ "\nby the card holder   : " + this.name
						+ "\n $"+this.amount+" IS SUCCESSFUL. ");
		System.out.println("-----------------------------------------------------------------------");
	}
}
