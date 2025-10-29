package com.week6.Hogwarts;

public class Wizard {
    String name;
    String house;
    double powerLevel;
    String WandType;
    static String school ="Hogwarts";
    static int noOfStudents;

    public void castSpell() {
        System.out.println(name + " from " + house + " casts Expelliarmus! ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public double getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(double powerLevel) {
        this.powerLevel = powerLevel;
    }

    public String getWandType() {
        return WandType;
    }

    public void setWandType(String wandType) {
        WandType = wandType;
    }
    static void welcomeMessage() {
        System.out.println("welcome to " + school + " of " + "Witchcraft and Wizardry!");
    }

}

