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
        User newUser = new User("John", "Doe", "5340407341");


    }
}
