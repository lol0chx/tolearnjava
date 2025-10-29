package com.week6.Hogwarts;

import java.util.ArrayList;
import java.util.List;

public class Home {
    static void main() {



        Wand harryWand = new Wand();
        harryWand.setWood("Holly");
        harryWand.setCore("Phoenix feather");
        harryWand.setLength(11);


        // Give the wizard their wand
       //
       Wizard.welcomeMessage();
      // harry.describeWand();

        Wizard hermione = new Wizard("Hermione", "Gryffindor", 13);
        //create professor object
        Professor snape = new Professor("SnapE","lolandor", 23, "Transfiguration");
        hermione.castSpell();
        snape.castSpell();

       // Wizard harry = new DarkWizard("harry", "Gryffindor", 23);
        //harry.castSpell();

        Wand hermioneWand = new Wand();
        hermioneWand.setWood("Vine");
        hermioneWand.setCore("Dragon heartstring");
        hermioneWand.setLength(8);

        Wand snapeWand = new Wand();
        snapeWand.setWood("line");
        snapeWand.setCore("Dragon heartstring");
        snapeWand.setLength(78);

        snape.setWand(snapeWand);
        //harry.setWand(harryWand);

        hermione.setWand(hermioneWand);

        List<MagicalBeing> wizards = new ArrayList<>();
        wizards.add(hermione);
       // wizards.add(harry);
        wizards.add(snape);
        wizards.add(new Professor("McGonagall", "Gryffindor", 95, "Transfiguration"));
        wizards.add(new DarkWizard());
        //wizards.add(new DarkWizard("Voldemort", "Slytherin", 100));
        System.out.println("\n\n\n");
        for(MagicalBeing wizard: wizards ){
            wizard.useMagic();
        }
snape.castSpell();


    }
}
