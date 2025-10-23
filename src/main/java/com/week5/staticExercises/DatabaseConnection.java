package com.week5.staticExercises;

public class DatabaseConnection {
    private static DatabaseConnection instance;

    private DatabaseConnection() {
        System.out.println("hello");
    }
    public static DatabaseConnection getInstance() {
        if (instance == null) {

            instance = new DatabaseConnection();

        }
        else {
            System.out.println("already exists");
        }
        return instance;
    }

}
