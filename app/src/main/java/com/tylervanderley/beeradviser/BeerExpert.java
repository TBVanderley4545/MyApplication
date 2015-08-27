package com.tylervanderley.beeradviser;

import java.util.List;
import java.util.ArrayList;

public class BeerExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        if(color.equalsIgnoreCase("light")) {
            brands.add("Bud Light");
            brands.add("Coors Light");
        } else if (color.equalsIgnoreCase("amber")) {
            brands.add("Yuengling");
            brands.add("Shotgun Betty");
        } else if(color.equalsIgnoreCase("dark")) {
            brands.add("Guiness");
            brands.add("Duck Rabbit Stout");
        } else if(color.equalsIgnoreCase("brown")){
            brands.add("New Castle");
        }
        return brands;
    }
}
