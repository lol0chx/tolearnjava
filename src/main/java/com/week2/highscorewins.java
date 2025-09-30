package com.week2;

import jdk.jshell.Snippet;

import java.util.Scanner;

public class highscorewins {
    void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a game score is this format \n HOME:VISITOR|21:9");
         String input = scanner.nextLine();
         String[] scorepart =input.split("\\|");
         String[] teams = scorepart[0].split(":");
         String[] score = scorepart[1].split(":");

         String hometeam1 =teams[0];
         String awayteam2 = teams[1];
         int homescore = Integer.parseInt(score[0]);
         int awayscore = Integer.parseInt(score[1]);

         if(homescore>awayscore){
             System.out.println("winner: "+ hometeam1);
         } else if (homescore<awayscore) {
             System.out.println("Winner: "+ awayteam2);
         }
         else{
             System.out.println("No winner");
         }
    }
}
