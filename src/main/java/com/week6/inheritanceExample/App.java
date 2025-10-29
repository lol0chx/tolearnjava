package com.week6.inheritanceExample;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Demonstrate cats list
        displayCats();

        // Existing demo kept for Axolotl
        Axolotl axolotl = new Axolotl("Axel", 2, "pink", 50);
        axolotl.blub();
    }

    /**
     * Create and display a small list of Cat instances.
     * This prints each cat's basic info and calls their meow() method.
     */
    public static void displayCats() {
        List<Cat> cats = new ArrayList<>();

        cats.add(new Cat("Mittens", 3, "gray", 9));
        cats.add(new Cat("Whiskers", 5, "orange", 8));
        cats.add(new Cat("Luna", 2, "black", 9));

        System.out.println("--- Cats List ---");
        for (Cat c : cats) {
            System.out.println("Name: " + c.getName()
                    + ", Age: " + c.getAge()
                    + ", Color: " + c.getColor()
                    + ", Lives left: " + c.getNrOfLivesLeft());
            c.meow();
        }
        System.out.println("-----------------");
    }
}