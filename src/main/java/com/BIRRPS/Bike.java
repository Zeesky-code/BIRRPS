package com.BIRRPS;

public class Bike {
	String id;
	double price;
	String parkingSpot;
	BikeSpec spec;
	Parts parts;


	public Bike(String id, double price, String parkingSpot, BikeSpec spec) {
		this.id = id;
		this.price = price;
		this.parkingSpot = parkingSpot;
		this.spec = spec;
	}
	public String getId() {
		return id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double newPrice) {
		this.price = newPrice;
	}

	public BikeSpec getSpec() {
		return spec;
	}

	public String getParkingSpot() {
		return parkingSpot;
	}
	public Parts getParts() {
		return parts;
	}

	public void setParts(Parts parts) {
		this.parts = parts;
	}
	public void getInFo() {
		System.out.println(

				"Model       : " + this.spec.getProperty("Model") +
				"\nColor       : " + this.spec.getProperty("Color") +
				"\nType        : " + this.spec.getProperty("Type") +
				"\nPrice       : $" + this.price

		);
	}

}
