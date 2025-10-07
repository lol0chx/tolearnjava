package com.week3;

import java.util.Scanner;

public class exercise1_exceptions {
    static Scanner scanner = new Scanner(System.in);
    static void main() {
        boolean anotherquote=true;
        String[] quotes = {
                "The only way to do great work is to love what you do. – Steve Jobs",
                "In the middle of every difficulty lies opportunity. – Albert Einstein",
                "Success is not final, failure is not fatal: it is the courage to continue that counts. – Winston Churchill",
                "Don’t watch the clock; do what it does. Keep going. – Sam Levenson",
                "Everything you’ve ever wanted is sitting on the other side of fear. – George Addair",
                "Happiness is not something ready made. It comes from your own actions. – Dalai Lama",
                "The future belongs to those who believe in the beauty of their dreams. – Eleanor Roosevelt",
                "You miss 100% of the shots you don’t take. – Wayne Gretzky",
                "Do what you can, with what you have, where you are. – Theodore Roosevelt",
                "Doubt kills more dreams than failure ever will. – Suzy Kassem"
        };
        while(anotherquote) {


            try {

                System.out.println("Enter a number between 1 -10");
                int num = scanner.nextInt();
                scanner.nextLine();
                System.out.println(quotes[num - 1]);


            } catch (Exception e) {
                System.out.println("enter a number in the range of 1-10 please " + e.getMessage());
            }
            System.out.println("Do you want to see another quote? Enter Y(for yes) N (for no");
            String ag = scanner.nextLine();
            if(!ag.equalsIgnoreCase("Y")){
                anotherquote = false;
                System.out.println("Ok bye");
            }
        }
    }
}
