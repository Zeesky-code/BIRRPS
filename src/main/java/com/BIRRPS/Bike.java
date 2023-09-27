package com.BIRRPS;

public record Bike (String id, double price, String parkingSpot, BikeSpec spec){
	public static Parts parts = null;
	public void getInFo() {
		System.out.println(

				"Model       : " + spec.getProperty("Model") +
						"\nColor       : " + spec.getProperty("Color") +
						"\nType        : " + spec.getProperty("Type") +
						"\nPrice       : $" + price

		);
	}

	public void setParts(Parts toRepair) {
		parts = toRepair;
	}
};

