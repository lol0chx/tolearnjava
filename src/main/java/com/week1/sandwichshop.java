package com.week1;

import java.util.Scanner;

public class sandwichshop {
     void main() {
         double discount =0;
         double price =0;
         System.out.println("1: Regular: base price $5.45\n" +
                 "b. 2: Large: base price $8.95");
         Scanner scanner = new Scanner(System.in);
         System.out.println("choose sandwich 1 or 2");
         int choice = scanner.nextInt();
         if (choice ==1){
             price =5.45;
         } else if (choice ==2) {
             price= 8.95;
         }
         scanner.nextLine();
         System.out.println("Do you want the sandwich laoded?\na. Regular: $1.00\n" +
                 "b. Large: $1.75");
         String loaded = scanner.nextLine();
         if (loaded.equalsIgnoreCase("a")){
             price =price +1;

         } else if (loaded.equalsIgnoreCase("b")) {
             price=price+1.75;

         }

         System.out.println("Enter your age ");
         int age = scanner.nextInt();
         scanner.nextLine();
         if (age <=17){
             discount =0.1;

         }
         else if (age >=65 ){
             discount= 0.2;
         }
        double finalprice =price -price*discount;
         System.out.println("your sandwich price is " + finalprice);
         System.out.println("discount " + discount*100 + "%");

    }
}
