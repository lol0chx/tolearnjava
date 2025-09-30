package com.week2;

import java.util.Scanner;

public class fullnamegen {
    static Scanner scanner = new Scanner(System.in);
    static void main() {
        System.out.println("please enter your name");
        String firstname = scanner.nextLine();
        firstname= firstname.trim();
        System.out.println("Middle name:");
        String middlename = scanner.nextLine();
        middlename=middlename.trim();
        System.out.println("Last name:");
        String lastname = scanner.nextLine();
        lastname=lastname.trim();
        System.out.println(firstname +" "+  middlename +" "+ lastname);

    }
}
