package com.week5.TestExercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class CombatManager {

    static Map<String, Integer> fighterMap = new HashMap<>();
    public CombatManager() {

    }
    public boolean addFighter(String name, int speed){
        if(fighterMap.containsKey(name)){
            return false;
        }
        String newName = name.toLowerCase();
        fighterMap.put(newName,speed);
        return true;
    }

    static void main() {
        fighterMap.put("nic",23);
        fighterMap.put("joe",25);
        fighterMap.put("jen",12);
        int a =0;
        String aa=null;
        System.out.println("=== Fighter Speeds ===");
        String[] sortedList = new String[3];
        ArrayList<String> fightersList = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : fighterMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());




            for (Map.Entry<String, Integer> entry2 : fighterMap.entrySet()) {

                if (entry.getValue() < entry2.getValue()) {

                     a = entry2.getValue();
                    aa=entry2.getKey();
                    fightersList.add(entry2.getKey());

                }
            }

        }
        System.out.println("highest "+aa+" "+ a);
        for (String fighter : fightersList) {
            System.out.println(fighter);
        }
    }

}
