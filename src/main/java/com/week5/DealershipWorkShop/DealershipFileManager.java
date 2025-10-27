package com.week5.DealershipWorkShop;

import java.io.*;
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
    
    // Get dealership with all data
    public Dealership getDealership() {
        try {
            BufferedReader bufReader = new BufferedReader(new FileReader("DealershipFiles/inventory.csv"));
            
            // Read dealership info (first line)
            String dealershipInfo = bufReader.readLine();
            String[] dealershipParts = dealershipInfo.split("\\|");
            String name = dealershipParts[0];
            String address = dealershipParts[1];
            String phone = dealershipParts[2];
            
            // Create dealership object
            Dealership dealership = new Dealership(phone, address, name);
            
            // Read header (second line)
            header = bufReader.readLine();
            bufReader.close();
            
            // Load vehicles using existing method
            List<Vehicle> vehicles = LoadInventory();
            dealership.setInventory(vehicles);
            
            return dealership;
            
        } catch (IOException e) {
            System.out.println("Error reading dealership file: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

}
