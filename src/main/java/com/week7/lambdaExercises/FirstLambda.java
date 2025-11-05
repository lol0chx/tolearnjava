package com.week7.lambdaExercises;

public class FirstLambda {
    static void main() {
        Hello hello = name-> System.out.println("Hello World! " + name);
        hello.sayHello("alice");
    }

}
