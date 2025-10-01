package com.oop;

import java.util.Scanner;

public class cellphoneapp {
    public static void main() {
        cellphone cp = new cellphone();
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is the serial number?");
        cp.setSerialnumber(scanner.nextLine());
        System.out.println("what model is the phone?");
        cp.setModel(scanner.nextLine());
        System.out.println("who is the carrier?");
        cp.setCarrier(scanner.nextLine());
        System.out.println("what is the phone number");
        cp.setPhonenumber(scanner.nextLine());
        System.out.println("who is the owner of the phone");
        cp.setOwner(scanner.nextLine());

        System.out.println(cp.getSerialnumber()+"\n"+cp.getModel()+"\n"+cp.getCarrier()+"\n"+cp.getPhonenumber()+"\n"+cp.getOwner());


    }
}
