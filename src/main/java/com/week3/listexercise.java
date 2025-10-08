package com.week3;

import java.util.ArrayList;
import java.util.List;

public class listexercise {
    static void main() {
        List<Integer> numbers = new ArrayList<>(List.of(2,3,4,52,5,2,65,334));
        System.out.println(numbers);
        listoffriends();
        listofnumbers();
    }

    public static void listoffriends(){
        List<String> friendslist = new ArrayList<>();
        friendslist.add("Nicolas");
        friendslist.add("sherman");
        friendslist.add("richie");
        friendslist.add("Vice");
        friendslist.remove(1);
        for (int i =0; i< friendslist.size();i++){
            //friendslist.set(i, friendslist.get(i)+ " l");
            System.out.println(friendslist.get(i));
        }
    }
    public static void listofnumbers(){
        List<Integer> listofnumbers = new ArrayList<>();
        int sum =0;
    for (int i =0; i<=10;i++)
    {
        listofnumbers.add(i);
    }
        for(int i=0; i<listofnumbers.size();i++){
            listofnumbers.set(i,listofnumbers.get(i)*2);
        }

        for (int i =0; i<=10;i++)
        {
            //listofnumbers.add(i);
            sum= sum +listofnumbers.get(i);
        }
        System.out.println(listofnumbers);
        System.out.println("sum: "+sum);
    }
}
