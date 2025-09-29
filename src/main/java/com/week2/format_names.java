package com.week2;

import java.util.Scanner;

public class format_names {
    Scanner scanner = new Scanner(System.in);
    void main(){
        System.out.println("whats your first name ");
        String firstname = scanner.nextLine();
        System.out.println("whats your last name");
        String lastname = scanner.nextLine();
        System.out.println(formatname(firstname,lastname));
    }
    public static String formatname(String first, String last){
        return last + "," +first;
    }
}
