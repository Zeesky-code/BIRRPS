package com.BIRRPS;

public enum Type {
	ROAD, MOUNTAIN, TOURING, ELECTRIC,HYBRID, BMX,CRUISER;

	public String toString() {
		switch (this) {
			case ROAD:
				return "ROAD";
			case MOUNTAIN:
				return "Mountain";
			case TOURING:
				return "Touring";
			case ELECTRIC:
				return "Electric";
			case HYBRID:
				return "Hybrid";
			case BMX:
				return "BMX";
			case CRUISER:
				return "Cruiser";
			default:
				return "Unspecified";
		}
	}
}