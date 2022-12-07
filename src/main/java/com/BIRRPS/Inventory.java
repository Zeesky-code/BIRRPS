package com.BIRRPS;

import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List BikeList;

	public Inventory() {
		BikeList = new LinkedList();
	}

	public void addBike(Bike... bikes){
		for(Bike bike:bikes){
			BikeList.add(bike);
		}
	}
	public void initializeInventory(){
		Bike bike1 = new BikeSpec("1", 2000, "A1", Bike.Type.ELECTRIC, Bike.Model.BIANCHI, Bike.Color.BLACK);
		Bike bike2 = new BikeSpec("2", 3500, "A2", Bike.Type.BMX, Bike.Model.CERVELO, Bike.Color.GREEN );
		Bike bike3 = new BikeSpec("3", 1000, "A2", Bike.Type.CRUISER, Bike.Model.COLNAGO, Bike.Color.RED);
		Bike bike4 = new BikeSpec("4", 10000, "A2", Bike.Type.MOUNTAIN, Bike.Model.CONNONDALE, Bike.Color.YELLOW );
		Bike bike5 = new BikeSpec("5", 700, "A2", Bike.Type.HYBRID, Bike.Model.KONA, Bike.Color.BLUE );
		Bike bike6 = new BikeSpec("6", 6200, "A2", Bike.Type.ROAD, Bike.Model.RALEIGH, Bike.Color.BLACK );
		Bike bike7 = new BikeSpec("7", 9000, "A2", Bike.Type.TOURING, Bike.Model.COLNAGO, Bike.Color.GREEN );
		Bike bike8 = new BikeSpec("8", 3500, "A2", Bike.Type.MOUNTAIN, Bike.Model.KONA, Bike.Color.YELLOW );
		Bike bike9 = new BikeSpec("9", 3500, "A2", Bike.Type.BMX, Bike.Model.BIANCHI, Bike.Color.RED);
	}

}
