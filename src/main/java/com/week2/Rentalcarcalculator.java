package com.week2;

import java.util.Scanner;

public class Rentalcarcalculator {
    static Scanner scanner = new Scanner(System.in);

    static void main() {
        double totalcost =0;
        double totaltagprice=0;
        double totalgpsprice = 0;
        double roadsideprice =0;
        System.out.println("********RENTAL CAR***********");
        System.out.println("a. whats your pick up date\n");
        String pickupdate = scanner.nextLine();
        System.out.println("\n b. number of days for the rental\n");
        int numberofdays = scanner.nextInt();
        scanner.nextLine();
        System.out.println("c.do you want an electronic toll tag at $3.95/day?   yes/ no");
        String tolltag = scanner.nextLine();
        if (tolltag.equalsIgnoreCase("yes")) {
            totaltagprice = numberofdays * 3.95;
        }
        System.out.println("d. do you want GPS at 2.95/ day?   Yes/no");
        String gps = scanner.nextLine();
        if (gps.equalsIgnoreCase("yes")){
            totalgpsprice = 2.95* numberofdays;
        }

        System.out.println("e. do you want a roadside assistance at $3.95/day yes/no");
        String roadside= scanner.nextLine();
        if (roadside.equalsIgnoreCase("yes")){
            roadsideprice =3.95 * numberofdays;
        }
        double basiccarrental = 0;
        System.out.println("how old are you");
        int age= scanner.nextInt();;
        scanner.nextLine();
        if(age<25){
            basiccarrental =(29.99+ (0.3*29.99) ) * numberofdays;
        }
        else {
            basiccarrental =29.99 * numberofdays;
        }

      totalcost = basiccarrental+totalgpsprice+totaltagprice+roadsideprice;
        System.out.println("Total price = "+ totalcost);

    }
}
