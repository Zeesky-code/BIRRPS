package com.BIRRPS;

public class BikeSpec {
	public enum Type{
		ROAD, MOUNTAIN, TOURING, ELECTRIC,HYBRID, BMX,CRUISER;

		public String toString() {
			return "Type{}";
		}
	}
	public enum Model{
		RALEIGH, CONNONDALE, KONA, CERVELO, COLNAGO, BIANCHI;

		public String toString() {
			return "Model{}";
		}
	}
	public enum Color{
		RED, YELLOW, BLUE, GREEN, BLACK;

		public String toString() {
			return "Color{}";
		}
	}
}
