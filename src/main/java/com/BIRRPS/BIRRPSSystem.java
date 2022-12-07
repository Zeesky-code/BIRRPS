package com.BIRRPS;

public class BIRRPSSystem {
	public void welcome(){


		System.out.println(
				"------------------------------------------------------------" +
				"\n-                           BIRRPS                         -" +
				"\n------------------------------------------------------------");


		System.out.println("Welcome to BIRRPS");
		System.out.println("\nHere is what you can do with BIRRPS. Please select the operation you want to do ");
		System.out.println(
				"\n1: Buy a Bike" +
				"\n2: Rent a Bike" +
				"\n3: Turn In Your Bike For a Repair");


		//The User selects their choice but since we are putting all inputs as a static,
		// we just chose to pass 1 for buying transactions


	}

	public void rentBike(){
		System.out.println("Enter the specs of the bike you want to rent:");
	}
}
