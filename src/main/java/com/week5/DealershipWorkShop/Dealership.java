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

    // Vehicle Management Methods
    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }
    
    public void removeVehicle(Vehicle vehicle) {
        inventory.remove(vehicle);
    }
    
    public List<Vehicle> getInventory() {
        return new ArrayList<>(inventory); // Return copy to prevent external modification
    }
    
    // Search Methods
    public List<Vehicle> getVehiclesByPriceRange(double minPrice, double maxPrice) {
        List<Vehicle> result = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getPrice() >= minPrice && vehicle.getPrice() <= maxPrice) {
                result.add(vehicle);
            }
        }
        return result;
    }
    
    public List<Vehicle> getVehiclesByMakeModel(String make, String model) {
        List<Vehicle> result = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getMake().equalsIgnoreCase(make) && vehicle.getModel().equalsIgnoreCase(model)) {
                result.add(vehicle);
            }
        }
        return result;
    }
    
    public List<Vehicle> getVehiclesByYearRange(int minYear, int maxYear) {
        List<Vehicle> result = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getYear() >= minYear && vehicle.getYear() <= maxYear) {
                result.add(vehicle);
            }
        }
        return result;
    }
    
    public List<Vehicle> getVehiclesByColor(String color) {
        List<Vehicle> result = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getColor().equalsIgnoreCase(color)) {
                result.add(vehicle);
            }
        }
        return result;
    }
    
    public List<Vehicle> getVehiclesByMileageRange(int minMileage, int maxMileage) {
        List<Vehicle> result = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getOdometer() >= minMileage && vehicle.getOdometer() <= maxMileage) {
                result.add(vehicle);
            }
        }
        return result;
    }
    
    public List<Vehicle> getVehiclesByType(String vehicleType) {
        List<Vehicle> result = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getVehicleType().equalsIgnoreCase(vehicleType)) {
                result.add(vehicle);
            }
        }
        return result;
    }
    
    // Getters and Setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }


    public void setInventory(List<Vehicle> inventory) {
        this.inventory = inventory;
    }
    
    // Method to list all vehicles
    public void listAllVehicles() {
        // Load inventory from CSV file
        DealershipFileManager fileManager = new DealershipFileManager();
        List<Vehicle> vehicles = fileManager.LoadInventory();
        this.inventory = vehicles;
        
        System.out.println("\n=== ALL VEHICLES ===");
        
        if (inventory.isEmpty()) {
            System.out.println("No vehicles found in inventory.");
        } else {
            System.out.println("VIN | Year | Make | Model | Type | Color | Odometer | Price");
            System.out.println("------------------------------------------------------------");
            for (Vehicle vehicle : inventory) {
                System.out.printf("%d | %d | %s | %s | %s | %s | %d | $%.2f%n",
                    vehicle.getVin(),
                    vehicle.getYear(),
                    vehicle.getMake(),
                    vehicle.getModel(),
                    vehicle.getVehicleType(),
                    vehicle.getColor(),
                    vehicle.getOdometer(),
                    vehicle.getPrice()
                );
            }
            System.out.println("\nTotal vehicles: " + inventory.size());
        }
    }
}
