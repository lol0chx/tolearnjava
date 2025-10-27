package com.week5.DealershipWorkShop;

import java.util.List;

public class UserInterface {

    public static void MainMenu(){
        Dealership seattle = new Dealership();
        System.out.println("seattle dealership");
        System.out.println("1.list all vehicles");
        
        // Display all vehicles
        seattle.listAllVehicles();
    }
    
}
