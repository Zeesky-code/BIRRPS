package com.BIRRPS;

public class BikeSpec implements Bike {

	private String id;
	private double price;
	private String parkingSpot;
	private Type type;
	private Model model;
	private Color color;


	public BikeSpec(String id, double price, String parkingSpot, Type type, Model model, Color color) {
		this.id = id;
		this.price = price;
		this.parkingSpot = parkingSpot;
		this.type = type;
		this.model = model;
		this.color = color;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void getInFo() {
		System.out.println("** Bikes **");
		System.out.println(
				"Color: " + getColor() +
				"\nType: " + getType() +
				"\nModel: " + getModel() +
				"\nPrice: $" + getPrice()

		);
	}
}
