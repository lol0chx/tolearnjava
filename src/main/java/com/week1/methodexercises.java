package com.week1;

import java.util.Scanner;

public class methodexercises {
     static void main(){
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter your name");
         String name = scanner.nextLine();
   printwelcome();
   displayplayername(name);
   showlevel(5);
   founditem(name, "sword");
   castspell("arrow", "fireball",12);
   gameover(name);
   displayinventory(name,5);
   enterdungeon(name, "limegrave");
   victory(name);
    }

 public static void printwelcome(){
     System.out.println("welcome to code quest");
 }
 public static void displayplayername(String playername){
     System.out.println("player joined :"+ playername);
 }
 public static void showlevel(int level){
     System.out.println("level:"+ level);
 }
 public static void founditem(String player, String item){
     System.out.println(player + " found a "+ item );
 }
 public static void castspell(String wizard, String spellname, int manacost){
     System.out.println(wizard+ " casts "+ spellname + " costing "+ manacost +" mana ");
 }
 public static void gameover(String player){
     System.out.println("GAME OVER for " + player +"!!");
 }
 public static void displayinventory(String player , int itemcount){
     System.out.println(player + " has "+ itemcount + " items in inventory.");
 }
 public static void enterdungeon(String player, String dungeonname){
     System.out.println(player + " bravely enters the "+ dungeonname);
 }
 public static void victory(String player){
     System.out.println(player + " does a little vicory dance!");
 }
}
