package com.example.mylocations;

public class Main {

    public static void main(String[] main) {
        Place place = new Place("Escuela Politecnica Superior de Gandia",
                "C/ Paranimf, 1 46730 Gandia (SPAIN)",
                -0.166093, 38.995656, 962849300, "http://www.epsg.upv.es",
                "Uno de los mejores lugares para formarse.", 3);

        System.out.println("Place " + place.toString());
    }
}
