package com.week5.staticExercises;

public class Cat {
    String name;
    static  int catCount=0;

    public Cat(String name)
    {
        this.name=name;
        catCount++;

    }
}
