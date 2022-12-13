package com.BIRRPS;

public class Bike {
	String id;
	double price;
	String parkingSpot;
	BikeSpec spec;

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

}
