package com.week6.inheritanceExample;

public class Cat extends Animal {

    public Cat(String name, int age, String color, int nrOfLivesLeft) {
        super(name, age, color);
        this.nrOfLivesLeft = nrOfLivesLeft;
    }

    public Cat(String name, int age, String color, double weight, int nrOfLivesLeft) {
        super(name, age, color, weight);
        this.nrOfLivesLeft = nrOfLivesLeft;
    }

    private int nrOfLivesLeft;

    public int getNrOfLivesLeft() {
        return nrOfLivesLeft;
    }

    public void setNrOfLivesLeft(int nrOfLivesLeft) {
        this.nrOfLivesLeft = nrOfLivesLeft;
    }

    public void meow() {
        System.out.println(getName() + " says: MEOW");
    }

}