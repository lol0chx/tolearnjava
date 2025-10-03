package com.week2.oop;

public class dicegame {
    static void main() {
        dice d1 = new dice();
        dice d2 = new dice();

        int totalseven=0;
        int toatlsix=0;
        int totalfour=0;
        int totaltwo=0;

        for (int i =0; i<100;i++)
        {
            int roll1 = d1.roll();
            int roll2 = d2.roll();
            int total = roll1+roll2;
            if(total==7){
                totalseven++;
            } else if (total==6) {
                toatlsix++;
            }
            else if (total==4) {
                totalfour++;
            }else if (total==2) {
                totaltwo++;
            }
        }
        System.out.printf("Nr of 7: %d\n Nr of 6: %d\n Nr of 4: %d\n Nr of 2: %d\n",totalseven,toatlsix,totalfour,totaltwo);
    }

}
