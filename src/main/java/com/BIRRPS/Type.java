package com.BIRRPS;

public enum Type {
	BMX, CRUISER, ELECTRIC, HYBRID, MOUNTAIN, ROAD, TOURING;

	public String toString() {
		return switch (this) {
			case ROAD -> "ROAD";
			case MOUNTAIN -> "Mountain";
			case TOURING -> "Touring";
			case ELECTRIC -> "Electric";
			case HYBRID -> "Hybrid";
			case BMX -> "BMX";
			case CRUISER -> "Cruiser";
		};
	}
}