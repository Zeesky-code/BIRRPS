package com.BIRRPS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BIRRPSSystem {
	public void welcome(){
		System.out.println(
				"--------------------------------------------------------------------------" +
				"\n-                             Welcome to BIRRPS                          -" +
				"\n--------------------------------------------------------------------------");

		System.out.println("Here is what you can do with BIRRPS:");
		System.out.println(
				"1: Buy a Bike" +
				"\n2: Rent a Bike" +
				"\n3: Turn In Your Bike For a Repair");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("\nPlease select the operation you want to perform.");
		//The User selects their choice but since we are putting all inputs as a static,
		// we just chose to pass 2 for buying transactions


	}
	public void buyBike(){
	}
	public void rentBike(){
		System.out.println("Enter the specs of the bike you want to rent:");
		//User enters their spec, but we'll add a static choice.
		Map userBike = new HashMap();
		userBike.put("Model", Model.CERVELO);
		userBike.put("Color", Color.YELLOW);

		BikeSpec userSpec = new BikeSpec(userBike);
	}
	public void repairBike(){

	}
	public List searchBike(BikeSpec specBike){
		List matchingBikes  = new ArrayList();
		return matchingBikes;
	}
	public void makePayment(double carAmount){
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Select a payment method from the following options:"+
				"\n 1. Cash Payment"+
				"\n 2. Credit Card Payment");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("You have chosen to make a Credit Card payment:"+
				"\nPlease enter your credit card details:");
		System.out.println("--------------------------------------------------------------------------");
		//user enters their details but for now, we use static data.
		Payment userPayment = new CreditCardPayment(carAmount,"John Doe", "12/29","1234532345");
	}
}
