package com.week6.Hogwarts;

public class Professor extends Wizard{
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void teachSpell(String spell) {
        System.out.println("Professor " + getName() + " teaches you " + spell + "in " + subject + "class");
    }

    public Professor(String name, String house, double powerLevel, String subject) {
        super(name,house,powerLevel);
        this.subject = subject;
    }
    @Override
    public void castSpell() {
        System.out.println(name + " from " + house + " casts Educational spell ");
    }
}
