package com.week6.Hogwarts;

public class Home {
    static void main() {
        Wizard harry = new Wizard();
        harry.setName("harry");
        harry.setHouse("Gryffindor");
       harry.castSpell();
       Wizard.welcomeMessage();

    }
}
