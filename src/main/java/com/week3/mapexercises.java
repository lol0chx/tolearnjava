package com.week3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mapexercises {
    static void main() {
        HashMap<String, Integer> nameAndAge = new HashMap<>();
        nameAndAge.put("Zia", 1);
        nameAndAge.put("Cliff", 1);
        nameAndAge.put("Jonas", 7);
        nameAndAge.put("Gaia", 10);


        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("thomas", "12345");
        phoneBook.put("mieraf", "154852");
        phoneBook.put("maaike", "78954");
        phoneBook.put("jenver", "98745");


        String nr = phoneBook.get("thomas");
        if (nr != null) {
            System.out.println("Thomas nr is: " + nr);
        }
        // ## 2) Word → length dictionary

        List<String> fruits = new ArrayList<>(List.of("banana", "apple", "grapefruit", "lemon"));
        Map<String, Integer> wordLengthMap = new HashMap<>();
        for (String fruit : fruits) {
            wordLengthMap.put(fruit, fruits.size());
        }
        Integer length = wordLengthMap.get("elephant");
        if (length != null) {
            System.out.println(length);
        } else {
            System.out.println("Not found");
        }


    }
}
