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

        BikeSystem.welcome();
        //user would select their choice of operation, but we'll select 1.
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("You have chosen to rent a bike.");
        BikeSystem.rentBike();
        User newUser = new User("John", "Doe", "5340407341");

    }
}
