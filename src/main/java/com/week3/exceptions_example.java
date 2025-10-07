package com.week3;

import java.util.Scanner;

public class exceptions_example {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        while (!done){
            try {
                System.out.println("please enter 1st int:");
                int nr1 = scanner.nextInt();
                scanner.nextLine();
                System.out.println("please enter a 2nd int: ");
                int nr2 = scanner.nextInt();
                scanner.nextLine();
                System.out.println("inter dividing : "+ (nr2/nr1));
                done = true;
            }catch (Exception e){
                System.out.println("there was a problem"+ e.getMessage());
                System.out.println("please try again ");
                scanner.nextLine();
            }
        }
    }
}
