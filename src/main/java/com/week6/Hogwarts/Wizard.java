package com.week6.Hogwarts;

public class Wizard extends MagicalBeing{
    String name;
    String house;
    double powerLevel;
    String WandType;
    static String school ="Hogwarts";
    static int noOfStudents;
    private Wand wand;

    public Wizard(Wand wand) {
        this.wand = wand;
    }

    public Wizard(String name, String house, double powerLevel) {
        this.name = name;
        this.house = house;
        this.powerLevel = powerLevel;
    }

    public void castSpell() {
        System.out.println(name + " from " + house + " casts Expelliarmus! ");
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        this.wand = wand;
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
    public void describeWand() {
        System.out.println(name + "'s wand is made of " +
                wand.getWood() + " with a " + wand.getCore() +
                " core, " + wand.getLength() + " inches long.");
    }


    @Override
    void useMagic() {
        System.out.println("i use magic for learning");
    }
}

