package com.BIRRPS;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BIRRPSSystem BikeSystem = new BIRRPSSystem();

        //create and initialize the inventory with existing bikes
        Inventory store = new Inventory();
        store.initializeInventory();

        //Load the System
        BikeSystem.welcome();

        //user would select their choice of operation, but we'll select 1.
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("You have chosen to rent a bike.");
        Bike rentBike = BikeSystem.rentBike();

        BikeSystem.makePayment(rentBike.getPrice());

        System.out.println("Please enter your user details");
        //user would enter their details, but we'll create a static user
        User newUser = new User("John", "Doe", "5340407341");

        Contract contract = new Contract(newUser, rentBike);
        contract.createContract();

        System.out.println("Please make sure to take the paper that contains parking spot info: " + rentBike.getParkingSpot()+
                " and keys from the box below... ");
        System.out.println("Thank you for choosing us ... see you again soon...");


    }



}
