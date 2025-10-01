package com.week2;

import java.util.Scanner;

public class fullnameparsereasy {
    static Scanner scanner = new Scanner(System.in);

    static void main() {
        System.out.println("enter you name");
        String fullname = scanner.nextLine();
        fullname = fullname.trim();
        String[] parts = fullname.split("\\s+");
        String firstname ="";
        String middlname ="(none)";
        String lastname ="";
        if(parts.length ==2 )
        {
            firstname=parts[0];
            lastname = parts[1];
        } else if (parts.length==3) {
            firstname = parts[0];
            middlname = parts[1];
            lastname = parts[2];
        }
        else {
            System.out.println("Invalid name format");
            return;
        }
        System.out.println("first name: "+ firstname);
        System.out.println("middle name: " + middlname);
        System.out.println("last name: "+ lastname);

    }
}
