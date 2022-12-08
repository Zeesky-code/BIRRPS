package com.BIRRPS;

import java.util.LinkedList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Inventory {
	private List BikeList;

	public Inventory() {
		BikeList = new LinkedList();
	}

	public void addBike(Bike... bikes){
		for(Object bike:bikes){
			BikeList.add(bike);
		}
	}
	public void initializeInventory(){
		//spec for bike 1
		Map bike1Properties = new HashMap();
		bike1Properties.put("Type", Type.ELECTRIC);
		bike1Properties.put("Model", Model.BIANCHI);
		bike1Properties.put("Color", Color.BLACK);

		Bike bike1 = new Bike("1", 2000, "A1",new BikeSpec(bike1Properties));

		//spec for bike 2
		Map bike2Properties = new HashMap();
		bike2Properties.put("Type", Type.BMX);
		bike2Properties.put("Model", Model.CERVELO);
		bike2Properties.put("Color", Color.GREEN);

		Bike bike2 = new Bike("2", 3500, "A2",new BikeSpec(bike2Properties));

		//spec for bike 3
		Map bike3Properties = new HashMap();
		bike3Properties.put("Type", Type.CRUISER);
		bike3Properties.put("Model", Model.COLNAGO);
		bike3Properties.put("Color", Color.RED);

		Bike bike3 = new Bike("3", 1000, "A3",new BikeSpec(bike3Properties));

		//spec for bike 4
		Map bike4Properties = new HashMap();
		bike4Properties.put("Type", Type.MOUNTAIN);
		bike4Properties.put("Model", Model.CONNONDALE);
		bike4Properties.put("Color", Color.YELLOW);

		Bike bike4 = new Bike("4", 2000, "A4",new BikeSpec(bike4Properties));

		//spec for bike 5
		Map bike5Properties = new HashMap();
		bike5Properties.put("Type", Type.HYBRID);
		bike5Properties.put("Model", Model.KONA);
		bike5Properties.put("Color", Color.BLUE);

		Bike bike5 = new Bike("5", 700, "A5",new BikeSpec(bike5Properties));

		//spec for bike 6
		Map bike6Properties = new HashMap();
		bike6Properties.put("Type", Type.ROAD);
		bike6Properties.put("Model", Model.RALEIGH);
		bike6Properties.put("Color", Color.BLACK);

		Bike bike6 = new Bike("6", 6200, "A6",new BikeSpec(bike6Properties));

		//spec for bike 7
		Map bike7Properties = new HashMap();
		bike1Properties.put("Type", Type.TOURING);
		bike1Properties.put("Model", Model.COLNAGO);
		bike1Properties.put("Color", Color.GREEN);

		Bike bike7 = new Bike("7", 9000, "A7",new BikeSpec(bike7Properties));

		//spec for bike 8
		Map bike8Properties = new HashMap();
		bike8Properties.put("Type", Type.MOUNTAIN);
		bike8Properties.put("Model", Model.KONA);
		bike8Properties.put("Color", Color.YELLOW);

		Bike bike8 = new Bike("8", 10000, "A8", new BikeSpec(bike8Properties));

		//spec for bike 8
		Map bike9Properties = new HashMap();
		bike9Properties.put("Type", Type.BMX);
		bike9Properties.put("Model", Model.BIANCHI);
		bike9Properties.put("Color", Color.RED);

		Bike bike9 = new Bike("9", 3500, "A2", new BikeSpec(bike9Properties));

		addBike(bike1, bike2, bike3 , bike4, bike5, bike6, bike7, bike8, bike9);
	}

}
