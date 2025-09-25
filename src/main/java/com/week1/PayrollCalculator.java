package com.week1;

import java.util.Scanner;

import static java.lang.System.out;

public class PayrollCalculator {
    void main()
    {
        Scanner input = new Scanner(System.in);
        out.println("what's you name :");
        String name = input.nextLine();
        out.println("how many hours did you work");
        float hoursworked = input.nextFloat();
        out.println("whats your pay rate");
        float payrate = input.nextFloat();
        float grosspay = hoursworked * payrate;
        out.printf("your gross pay is %.1f", grosspay);

    }
}
