package com.week1;

import java.util.Scanner;

public class input {
    static void main() {
        Scanner s = new Scanner(System.in);
        System.out.println("whats your name");
        String name = s.nextLine();
        System.out.println(name);
        int age = s.nextInt();
        System.out.println("i am "+ age);
        s.nextLine();
        System.out.println("whats your fav color");
        String color = s.nextLine();
        System.out.println("favorite color is " + color);
    }
}
