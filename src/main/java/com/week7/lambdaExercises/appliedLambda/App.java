package com.week7.lambdaExercises.appliedLambda;

import java.util.ArrayList;
import java.util.List;

public class App {
    static void main() {

       List<Integer> nums = List.of(1,2,3,4,5,6,7,8);
       List<String> randomWords = List.of("java", "python", "c++");

        // lambda expression to check if the numbers are even
        IntFilter filterEvenNumbers = numbe -> numbe % 2 == 0;

       List<Integer> evenNumbers = filterNumber(filterEvenNumbers, nums);
        System.out.println(evenNumbers);

        //lambda expression to check if the word length is 4 or greater than 4
        StringFilter afterwords = words -> words.length() > 4;

        List<String> longWords = filterWords(afterwords, randomWords);

        System.out.println(longWords);
    }

        static List<Integer> filterNumber(IntFilter filter , List<Integer> numbers){
            List<Integer> filteredNumbers = new ArrayList<>();
            for(Integer num: numbers) {
                if(filter.filter(num)) {
                    filteredNumbers.add(num);
                }
            }
            return filteredNumbers;
        }

        static List<String> filterWords(StringFilter filter, List<String> words) {
        List<String> filteredWords = new ArrayList<>();
        for(String word: words) {
            if(filter.filter(word)) {
                filteredWords.add(word);
            }
        }
        return filteredWords;
        }
    }


