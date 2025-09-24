package com.week1;

public class recapexercises {
    static void main() {

      double x = 12.4;
      System.out.print("*******Challenge A: Double Trouble******** \n");
      System.out.println(x);
      System.out.print(x * 2 );
      System.out.print("\n*******Challenge B: Name + Number********\n");
      String name = "Henok\n";
      int favnum= 25;
      System.out.println( name + favnum);
        System.out.print("\n*******Challenge C: Random Surprise + Number********\n");
        int random =  (int) (Math.random() *10);
        System.out.println(random);
        System.out.println(random + 5);
        System.out.print("\nBonus 2: Minutes to Hours and Minutes\n");
        int minutes =175;
        int Hours = minutes / 60;
        int Leftover = minutes % 60;
        System.out.println(minutes + " minutes =" + Hours +" Hours and " + Leftover + " minutes") ;
        System.out.print("\nBonus 3: Time Calculator\n");
        int nrHours = 3;
        int nrMinutes = 40;
        int minutesToAdd = 183;
        int lefthours = minutesToAdd/60;
        nrHours = nrHours + lefthours;
        int leftmin = 183 % 60;
        nrMinutes= nrMinutes + leftmin;
        System.out.println("Final time "+ nrHours +":"+ nrMinutes);
    }
}
