package com.week2;

public class comparenumbers {
    void main(){
        System.out.println(iseven(5));
        System.out.println(ispositive(19));
        int nr =12;

        //this is ternarystatement basically if simplfied.
        // syntax is -- conditioin? valuefortrue: vlaue for false?
        boolean isodd = nr %2!=0? true: false;
        System.out.println(isodd);
    }
    public static boolean iseven(int number){
        return number %2 ==0;

    }
    public static boolean ispositive(double number){
        return number> 0;
    }
}
