package com.week5.DealershipWorkShop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DealershipFileManager {
     String header="";
     List<Vehicle> inventory = new ArrayList<>();
    public List<Vehicle> LoadInventory(){
        String header="";
        try {

            BufferedReader bufReader = new BufferedReader (new FileReader("DealershipFiles/inventory.csv")); // reads the file
            header=bufReader.readLine(); // skips the first line
            bufReader.readLine();
            String vehicleRead;
            while ((vehicleRead = bufReader.readLine()) != null) {
                // Skip empty lines
                if (vehicleRead.trim().isEmpty()) {
                    continue;
                }

                String[] parts = vehicleRead.split("\\|");

                Vehicle vehicle = new Vehicle(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),parts[2],parts[3],parts[4],parts[5],Integer.parseInt(parts[6]),Double.parseDouble(parts[7])) ;
                inventory.add(vehicle);
            }
            bufReader.close();
        } catch (IOException e) {
            // display stack trace if there was an error
            System.out.println("\nError reading file");
            e.printStackTrace();
        }
        return inventory;
    }

    public void displayInventory(){
        System.out.println("List of Inventory ");
        System.out.println(header);
        for(Vehicle vehicles: inventory) {
            System.out.println(vehicles);
        }
    }
}
