package com.BIRRPS;

import java.util.*;

public class BIRRPSSystem {
	Inventory store = new Inventory();

	public void welcome(){

		store.initializeInventory();
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
		System.out.println("Please select the operation you want to perform.");
		//The User selects their choice but since we are putting all inputs as a static,
		// we just chose to pass 2 for buying transactions


	}
	public Bike buyBike(){
		System.out.println("Enter the specs of the bike you want to buy:");
		System.out.println("--------------------------------------------------------------------------");
		//User enters their spec, but we'll add a static choice.
		HashMap<String, Object> userBike = new HashMap<>();
		userBike.put("Model", Model.BIANCHI);
		userBike.put("Color", Color.BLACK);
		userBike.put("Type", Type.ELECTRIC);

		BikeSpec userSpec = new BikeSpec(userBike);
		System.out.println("Would you like to buy this bike?");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("You have chosen to buy a bike.");
		return searchBike(userSpec).get(0);
	}
	public Bike rentBike(){
		System.out.println("Enter the specs of the bike you want to rent:");
		System.out.println("--------------------------------------------------------------------------");
		//User enters their spec, but we'll add a static choice.
		HashMap<String, Object> userBike = new HashMap<>();
		userBike.put("Model", Model.CONNONDALE);
		userBike.put("Color", Color.YELLOW);
		userBike.put("Type", Type.MOUNTAIN);

		BikeSpec userSpec = new BikeSpec(userBike);
		System.out.println("Would you like to rent this bike?");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("You have chosen to rent a bike.");
		return searchBike(userSpec).get(0);

	}
	public Bike repairBike(){
		System.out.println("Enter the specs of the bike you want to repair:");
		System.out.println("--------------------------------------------------------------------------");

		//User enters their spec, but we'll add a static choice.
		HashMap<String, Object> userBike = new HashMap<>();
		userBike.put("Model", Model.CONNONDALE);
		userBike.put("Color", Color.YELLOW);
		userBike.put("Type", Type.MOUNTAIN);
		BikeSpec userSpec = new BikeSpec(userBike);
		System.out.println("Enter the part of the bike to be repaired:");

		//User enters the part, but we'll add a static choice.
		Parts toRepair = Parts.BRAKES;

		System.out.println("Please enter the location of the bike for pickup:");

		//User enters the address, but we'll add a static choice.
		String address = "Random address";

		double price = 4500.50;

		Bike repairBike = new Bike("repair", price, address,userSpec);
		repairBike.setParts(toRepair);

		return repairBike;
	}
	public ArrayList<Bike> searchBike(BikeSpec specBike){
		ArrayList<Bike> matchingBikes  = store.search(specBike);

		System.out.println("These is the available bike that matches your search:");
		int count =0;
		for (Iterator<Bike> i = matchingBikes.iterator(); i.hasNext(); ) {
			count++;
			Bike bike = (Bike)i.next();

			System.out.println("----------------------------Bike "+count+" ---------------------------------------");
			bike.getInFo();
		}
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
		System.out.println("Thanks for entering your card details.");
		Payment userPayment = new CreditCardPayment(carAmount,"John Doe", "12/29","123453234596346");
		userPayment.paymentDetails();
	}
}
