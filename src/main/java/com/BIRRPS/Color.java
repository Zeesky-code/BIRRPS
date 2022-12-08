package com.BIRRPS;

public enum Color{
	RED, YELLOW, BLUE, GREEN, BLACK;

	public String toString() {
		switch (this){
			case RED:
				return "Red";
			case YELLOW:
				return "Yellow";
			case BLUE:
				return "Blue";
			case GREEN:
				return "Green";
			case BLACK:
				return "Black";
			default:
				return "Unspecified";
		}

	}
}
