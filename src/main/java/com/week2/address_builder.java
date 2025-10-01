package com.week2;

import java.util.Scanner;

public class address_builder {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder address = new StringBuilder();
        System.out.println("Please provide the following information");
        System.out.println("\nFull Name:");
        address.append(scanner.nextLine()).append("\n\n");
        System.out.println("Billing street:");
        address.append(scanner.nextLine()).append("\n");
        System.out.println("Billing city:");
        address.append(scanner.nextLine()).append("\n");
        System.out.println("Billing State:");
        address.append(scanner.nextLine()).append("\n");
        System.out.println("Billing zip:");
        address.append(scanner.nextLine()).append("\n\n");
        System.out.println("Shipping street:");
        address.append(scanner.nextLine()).append("\n");
        System.out.println("shipping city");
        address.append(scanner.nextLine()).append("\n");
        System.out.println("shipping state");
        address.append(scanner.nextLine()).append("\n");
        System.out.println("shipping ZIP");
        address.append(scanner.nextLine()).append("\n");
        String finaladdress = address.toString();
        System.out.println(finaladdress);

    }
}
