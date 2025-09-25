package com.week1;

import java.util.Scanner;

import static java.lang.System.out;

public class basic_calculator {
    void main(){
        Scanner input = new Scanner(System.in);
        out.println("Enter the first number:");
        int firstnum = input.nextInt();
        input.nextLine();
        out.println("Enter the second number");
        int secondnum = input.nextInt();
        input.nextLine();
        out.println("Possible calculations:\n" +
                "(A)dd\n" +
                "(S)ubtract\n" +
                "(M)ultiply\n" +
                "(D)ivide\n");
        String in= input.nextLine();
        int result = firstnum * secondnum;
        out.println("the result is " + result);

    }
}
