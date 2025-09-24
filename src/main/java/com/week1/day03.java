package com.week1;

public class day03 {
    static void main() {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        IO.println(String.format("Hello and welcome!"));

   //double randomvalue = Math.random();

        for (int i=0;i<20; i++) {
            int randomnum =  (int) (Math.random() *7);
            if (randomnum ==0) {
                randomnum = randomnum +1;
            }
            System.out.println(randomnum);
            nextline();
        }
   }

    private static void nextline() {
    }

}

