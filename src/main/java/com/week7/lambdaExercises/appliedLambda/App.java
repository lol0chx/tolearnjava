package com.week7.lambdaExercises.appliedLambda;

import java.util.ArrayList;
import java.util.List;

public class App {
    static void main() {
       IntFilter filterEvenNumbers = numbers -> numbers % 2 == 0;
       List<Integer> nums = List.of(1,2,3,4,5,6,7,8);

       List<Integer> evenNumbers = filterNumber(filterEvenNumbers, nums);
        System.out.println(evenNumbers);
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
    }


