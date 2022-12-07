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
        BikeSystem.welcome();
        User newUser = new User("John", "Doe", "5340407341");

        System.out.println( "Hello World!" );
    }
}
