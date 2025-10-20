package com.week3.payrollcalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class te {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        // ---- Get Name ----
        String name = "";
        boolean validName = false;
        while (!validName) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine().trim();
            if (!name.isEmpty()) {
                validName = true; // valid name
            } else {
                System.out.println("Invalid input! Name cannot be empty.");
            }
        }

        // ---- Get Age ----
        int age = 0;
        boolean validAge = false;
        while (!validAge) {
            System.out.print("Enter your age: ");
            try {
                age = scanner.nextInt();
                if (age > 0) { // age must be positive
                    validAge = true;
                } else {
                    System.out.println("Invalid input! Age must be positive.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Wrong input! Please enter a numeric age.");
                scanner.nextLine(); // clear invalid input
            }
        }

        System.out.println("\nYou entered:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
