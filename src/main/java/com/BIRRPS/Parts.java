package com.BIRRPS;

public enum Parts {
	FRAME, SADDLE, HEADSET, FORK, HANDLEBARS, BRAKES, WHEELS;
	public String toString() {
		switch (this) {
			case FRAME:
				return "Frame";
			case SADDLE:
				return "Saddle";
			case HEADSET:
				return "Headset";
			case FORK:
				return "Fork";
			case HANDLEBARS:
				return "Handlebars";
			case BRAKES:
				return "Brakes";
			case WHEELS:
				return "Wheels";
			default:
				return "Unspecified";
		}
	}
}
