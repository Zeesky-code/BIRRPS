package com.BIRRPS;

public enum Model{
	RALEIGH, CONNONDALE, KONA, CERVELO, COLNAGO, BIANCHI;

	public String toString() {
		switch (this){
			case RALEIGH:
				return "Raleigh";
			case CONNONDALE:
				return "Connondale";
			case KONA:
				return "Kona";
			case CERVELO:
				return "Cervelo";
			case COLNAGO:
				return "Colnago";
			case BIANCHI:
				return "Bianchi";
			default:
				return "Unspecified";
		}

	}
}
