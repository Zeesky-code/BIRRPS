package com.BIRRPS;


public interface Bike {
    public enum Type{
        ROAD, MOUNTAIN, TOURING, ELECTRIC,HYBRID, BMX,CRUISER;

        public String toString() {
            switch (this){
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


    void getInFo();

    Type getType();
    Model getModel();
    double getPrice();
    Color getColor();


}
