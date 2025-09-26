package com.week1;

import java.util.Scanner;

public class methodexercises2 {

    void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name");
        String playername = scanner.nextLine();
        int xp=110;
        int threshold =100;
        int strength =20;
        int enemydefense=50;
        boolean key= true;
        boolean lock= false;
        System.out.println(getplayertitle(playername));
        System.out.println(doublexp(xp) + " xp");
        if (hasleveledup(xp,threshold)) {
            System.out.println("You leveled up");
        }
        else{
            System.out.println("keep grinding");
        }
        System.out.println(rolldice());
        System.out.println(rolldice());
        System.out.println(rolldice());
        System.out.println("damage dealt " + calculatedamage(strength,enemydefense));
       // System.out.println(canopenchest(key,lock));
        if (canopenchest(key,lock)){
            System.out.println("you can open the chest");
        }
        else {
            System.out.println("You CANT OPEN the chest");
        }
        System.out.println("whats your class");
        int Class = scanner.nextInt();
        scanner.nextLine();
        System.out.println(getplayerclass(Class));

    }
    public static String getplayertitle(String name){
        return "lord "+ name;
    }
    public static int doublexp(int xp){
        return xp * 2;
    }
    public static boolean hasleveledup(int currentxp, int threshold){
        return currentxp>=threshold;
        }
    public static int rolldice(){
        return  (int) (Math.random() *7);
    }
    public static int calculatedamage(int strength, int enemydefense){
        int result =(strength * 2) -enemydefense;
        if (result< 0){
            return 0;
        }
        else {
            return result;
        }
    }
    public static boolean canopenchest(boolean haskey, boolean lockisbroken){
        if(haskey || lockisbroken)
        {
        return true;
    }
        else {
            return false;
        }
    }
    public static String getplayerclass(int choice) {
        if (choice == 1) {
            return "warrior";
        }
        else if (choice == 2) {
            return "mage";

        }
        else if (choice==3){
            return "rogue";
        }
 return "default";
    }
    }

