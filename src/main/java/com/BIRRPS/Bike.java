package com.BIRRPS;

public class Bike {
	private String id;
	private double price;
	private String parkingSpot;
	private BikeSpec spec;

	public Bike(String id, double price, String parkingSpot, BikeSpec spec) {
		this.id = id;
		this.price = price;
		this.parkingSpot = parkingSpot;
		this.spec = spec;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	public String getParkingSpot() {
		return parkingSpot;
	}

	public void setParkingSpot(String parkingSpot) {
		this.parkingSpot = parkingSpot;
	}

	public BikeSpec getSpec(){
		return spec;
	}



	public void getInFo() {
		System.out.println("** Bikes **");
		System.out.println(
				"Color: " + spec.getProperty("Type") +
						"\nType: " + spec.getProperty("Model") +
						"\nModel: " + spec.getProperty("Color") +
						"\nPrice: $" + getPrice()

		);
	}
}
