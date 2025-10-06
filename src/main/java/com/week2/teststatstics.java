package com.week2;

public class teststatstics {
    static void main() {
        int[] testscores={75,89,88,58,98,56,76,65,76,79};
        int sum =0;
        double average;
        int highscore =0;
        int lowscore=101;

        for(int i =0;i<testscores.length;i++)
        {

            sum= sum+ testscores[i];
            if(testscores[i]>highscore){
                highscore=testscores[i];
            }
            if(testscores[i]<lowscore){
                lowscore=testscores[i];
            }

        }
        System.out.println(sum);
        average= sum /testscores.length;
        System.out.println("Average:"+ average);
        System.out.println("hgh score:"+ highscore);
        System.out.println("Low score:"+ lowscore);
    }
}
