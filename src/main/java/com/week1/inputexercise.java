package com.week1;

import java.util.Scanner;

import static java.lang.System.out;

public class inputexercise {
    void main() {
        Scanner s = new Scanner(System.in);
        out.println("whats your favorite animal ");
        String name = s.nextLine();
        out.println("First tool that comes to mind");
        String tool = s.nextLine();
        out.println("number of day of birth");
        int day = s.nextInt();
        s.nextLine();
        System.out.printf("You're favorite animal is %s, first tool that comes to mind is %s and the day you were born is %d",
                name, tool, day);
    }
}
