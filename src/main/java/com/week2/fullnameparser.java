package com.week2;

import java.util.Scanner;

public class fullnameparser {
    static Scanner scanner = new Scanner(System.in);
    static void main() {
        System.out.println("enter you name");
        String fullname = scanner.nextLine();
        fullname = fullname.trim();
        int length = fullname.length();
        int firstspace =fullname.indexOf(" ");
        String firstname = fullname.substring(0,firstspace);
        System.out.println("first name :"+firstname);
        String fullname2 = fullname.substring(firstspace+1,length);

        System.out.println("middle name "+fullname2);
       // String middlename = fullname.substring(firstspace+1,5);
    }
}
