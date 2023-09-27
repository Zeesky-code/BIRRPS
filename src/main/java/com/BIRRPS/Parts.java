package com.BIRRPS;

public enum Parts {
	BRAKES, FORK, FRAME, HANDLEBARS, HEADSET, SADDLE, WHEELS;

	public String toString() {
		return switch (this) {
			case FRAME -> "Frame";
			case SADDLE -> "Saddle";
			case HEADSET -> "Headset";
			case FORK -> "Fork";
			case HANDLEBARS -> "Handlebars";
			case BRAKES -> "Brakes";
			case WHEELS -> "Wheels";
		};
	}
}
