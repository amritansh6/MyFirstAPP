package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getbrands(String color)
    {
        List<String> brands = new ArrayList<>();
        if(color.equals("amber")){
            brands.add("Jack Amber");
            brands.add("Red Moose");
        }
        else
        {
            brands.add("Jail pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }

}
