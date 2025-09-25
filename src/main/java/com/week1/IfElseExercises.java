package com.week1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IfElseExercises {
    void main()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*******Exercise 1: Is it positive?*********");
        int number = 7;
        // TODO: print "Positive number" if number > 0, otherwise "Not positive"
        if (number>0){
            System.out.println("it is positive");

        } else if (number <0) {
            System.out.println("it is negative");
        }
        else {
            System.out.println("its ZERO");
        }
        System.out.println("*********EVEN OR ODD************");
        // Exercise 2: Even or odd
        int x = 10;
        // TODO: print "Even" if x is divisible by 2, otherwise "Odd"
        if (x % 2 == 0)
        {
            System.out.println("EVEN");
        }
        else
        {
            System.out.println("ODD");
        }
        System.out.println("**************Exercise 3: Temperature check****************");
        // Exercise 3: Temperature check
        int temperature = 30; // celcius
        // TODO: print "Hot" if temperature > 25, otherwise "Not hot"
        if (temperature > 25)
        {
            System.out.println("HOT");
        }
        else {
            System.out.println("NOT HOT");
        }
        System.out.println("******************* Exercise 4: Teenager check**********************");
        // Exercise 4: Teenager check
        int age = 15;
        // TODO: print "Teenager" if age is between 13 and 19, otherwise "Not a teenager"
        if (age >13 && age <=19 )
        {
            System.out.println("TEENAGER");
        }
        else {
            System.out.println("NOT A TEENAGER");
        }
        // Exercise 5: Can vote?
        System.out.println("**************Exercise 5: Can vote?****************");
        int age2 = 17;

        // TODO: print "Can vote" if age2 >= 18, otherwise "Too young to vote"
        if (age2 >=19) {
            System.out.println("can vote");

        }
        else
        {
            System.out.println("TOO young to vote");
        }
        System.out.println("**************Multiple of both******************");
        // Exercise 6: Multiple of both
        int y = 30;
        if (y % 3 ==0 && y % 5==0){
            System.out.println("Divisible by 3 and 5");

        }
        else {
            System.out.println("not divisible by 3 and 5");
        }
        // TODO: print "Divisible by 3 and 5" if divisible by both, otherwise "Not divisible by 3 and 5"

        // Exercise 7: Outside safe range
        System.out.println("****************Exercise 7: Outside safe range*****************");
        int speed = 120;
        if (speed <30 || speed >100){
            System.out.println("Unsafe speed");
        }
        else {
            System.out.println("safe speed");
        }
        // TODO: print "Unsafe speed" if speed < 30 or speed > 100, otherwise "Safe speed"

        // Exercise 8: Leap year check (simplified)
        System.out.println("**************// Exercise 8: Leap year check (simplified)**************");
        int year = 2025;
        if (year %4== 0 && year%100 !=0){
            System.out.println("Leap year ");
        }
        else {
            System.out.println("not leap year ");
        }
        // TODO: print "Leap year" if year divisible by 4 and not divisible by 100, otherwise "Not leap year"

        // Exercise 9: Bigger number
        System.out.println("**********Exercise 9: Bigger number***********");
        int a = 8;
        int b = 12;
        if (a>b)
        {
            System.out.println(a+" is greater than "+ b);
        } else if (b>a ) {
            System.out.println(b+"is greater than"+ a);

        }
        // TODO: print which one is bigger (a or b)

        // Exercise 10: Grade check
        System.out.println("************Exercise 10: Grade check***********");
        int score = 55;
        if (score>=50){
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }
        // TODO: print "Pass" if score >= 50, otherwise "Fail"
    }
}
