package com.week2;

public class comparenumbers {
    void main(){
        System.out.println(iseven(5));
        System.out.println(ispositive(19));
    }
    public static boolean iseven(int number){
        return number %2 ==0;

    }
    public static boolean ispositive(double number){
        return number> 0;
    }
}
