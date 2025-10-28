package com.week6.inheritanceExample;

public class Axolotl extends Animal {


    public Axolotl(String name, int age, String color, double weight) {
        super(name, age, color, weight);
    }

    public void blub() {
        System.out.println(getName() + " says: blub");
    }
}