package com.week7.StreamsPart2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.week1.methodexercises2.scanner;

public class Program {
    static void main() {
        List<Person> people = List.of(
                new Person("Alice", "Smith", 25),
                new Person("Bob", "Johnson", 30),
                new Person("Charlie", "Williams", 22),
                new Person("David", "Brown", 28),
                new Person("Ethan", "Jones", 35),
                new Person("Fiona", "Garcia", 27),
                new Person("George", "Martinez", 31),
                new Person("bob", "Davis", 24),
                new Person("Ivan", "Lopez", 29),
                new Person("Julia", "Wilson", 26)
        );
        System.out.println("Enter a name to search: ");
        String searchName = scanner.nextLine();

        int oldest = Integer.MIN_VALUE;
        int youngest = Integer.MAX_VALUE;
        int avgAge=0;

        // Calculate average age using stream
        avgAge = people.stream()
                .mapToInt(Person::getAge)
                .sum();

        // Find matches using stream
        List<Person> matches = people.stream()
                .filter(person -> person.getFirstName().equalsIgnoreCase(searchName))
                .collect(Collectors.toList());

        // Find oldest and youngest among matches
        if (!matches.isEmpty()) {
            oldest = matches.stream()
                    .mapToInt(Person::getAge)
                    .max()
                    .getAsInt();
            youngest = matches.stream()
                    .mapToInt(Person::getAge)
                    .min()
                    .getAsInt();
        }
        if (matches.isEmpty()) {
            System.out.println("no match found");
        } else {
            for (Person p : matches) {
                System.out.println(p);
            }


            System.out.println("avergae age is of the whole list : " + avgAge/people.size());
            System.out.println("Oldest matching person's age: " + oldest);
            System.out.println("Youngest matching person's age: " + youngest);
        }

    }
}
