package com.week5.DealershipWorkShop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Dealership {

    String name;
    String address;
    String phone;
     String header ="";

    List<Vehicle> inventory = new ArrayList<>();

    public Dealership( String phone, String address, String name) {

        this.phone = phone;
        this.address = address;
        this.name = name;
    }
    public Dealership(){

    }

    
}
