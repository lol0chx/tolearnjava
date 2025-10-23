package com.week5.staticExercises;

public class DatabaseConnectionMain {
    static void main() {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        DatabaseConnection db3 = DatabaseConnection.getInstance();

        System.out.println("Are db1 and db2 the same? " + (db1 == db2));
    }
}
