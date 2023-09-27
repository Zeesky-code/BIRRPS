package com.BIRRPS;

public enum Model {
	BIANCHI, CERVELO, COLNAGO, CONNONDALE, KONA, RALEIGH;

	public String toString() {
		return switch (this) {
			case RALEIGH -> "Raleigh";
			case CONNONDALE -> "Connondale";
			case KONA -> "Kona";
			case CERVELO -> "Cervelo";
			case COLNAGO -> "Colnago";
			case BIANCHI -> "Bianchi";
		};

	}
}
