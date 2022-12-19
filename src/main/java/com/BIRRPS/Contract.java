package com.BIRRPS;


import java.time.LocalDate;

public class Contract {
	User user;
	Bike bike;

	public Contract(User user, Bike bike) {
		this.user = user;
		this.bike = bike;
	}
	public void createContract(){
			System.out.println("***********************CONTRACT FOR SELLING A CAR*********************** ");

			System.out.println("BUYER");


			System.out.println(

					"NAME         : " + user.getFirstName()+ " " + user.getLastName()
							+"\nPhone Number : " + user.getPhoneNumber());
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("SELLER: BIRRPS");
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("BIKE DETAILS:");
			System.out.println("Upon the receipt of payment in full, the Seller agrees to transfer to the Buyer" +
					" ownership (registration\n" +
					"and/or title) of the following bike:");
			bike.getInFo();

			System.out.println("----------------------------------------------------------------------------");
			System.out.println("PAYMENT INFO $"+ bike.getPrice());
			System.out.println("The Buyer will pay the Seller the purchase price in full by cash," +
					" credit card, or by Exchange with another bike if agreed upon by both parties.");

			System.out.println("----------------------------------------------------------------------------");

			LocalDate date = LocalDate.now();

			System.out.println("----------------------------------------------------------------------------");

			System.out.println("HOLDING DEPOSIT:");
			System.out.println("The Seller acknowledges that a holding deposit of $"+bike.getPrice()+" (amount) was received from\n" +
					"the Buyer on "+date);
			System.out.println("----------------------------------------------------------------------------");

			System.out.println("SELLER'S RESPONSIBILITIES:");
			System.out.println("“The Buyer acknowledges that all the above mentioned paperwork and/or documentation was received\n" +
					"from the Seller.");
			System.out.println("----------------------------------------------------------------------------");



			System.out.println("“AS IS” DISCLAIMER:");
			System.out.println("Both parties acknowledge that the above mentioned vehicle is sold as seen, that the buyer has tried and\n" +
					"inspected the vehicle to his/her satisfaction and has approved the purchase with the understanding that\n" +
					"the vehicle is sold “AS IS” without warranties or guarantees, either expressed or implied.\n" +
					"The Buyer accepts full responsibility for any repairs incurred following "+date+" (Date of sale),\n" +
					"as well as any costs related to  safety certification, or transfer of\n" +
					"ownership.All risks and responsibilities pass to the Buyer once payment is made in full and the Buyer takes\n" +
					"possession of the bike.");
			System.out.println("----------------------------------------------------------------------------");


			System.out.println("SIGNATURES:");
			System.out.println("" +
					"Buyer's Signature ___(Electronic Signature)__ Date "+date+"\n" +
					"Seller's Signature ___(Electronic Signature)__ Date "+date+"\n");

			System.out.println("--------------------------------------------------------------------------");

	}
}
