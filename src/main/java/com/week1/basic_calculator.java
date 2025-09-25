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
        out.println("choose what you want to do ");
        String in = input.nextLine();
        if (in.equals("A") || in.equals("a"))
        {
            int result = firstnum + secondnum;
            out.println("the result is "+ result);
        }
        else {
            out.println("choose an opiton");
        }
//        int in= input.nextInt();
//        input.nextLine();
//        if (in == 1){
//            int result = firstnum + secondnum;
//            out.println("the result is " + result);
//        }
//        else if (in == 2) {
//            int result = firstnum - secondnum;
//            out.println("the result is "+ result);
//
//        }
//        else {
//            out.println("error");
//        }


    }
}
