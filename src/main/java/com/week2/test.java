package com.week2;

public class test {
    static void main() {
        String s1 = "Java";

        String s2 = "Java";

        String s3 = new String("Java");

        System.out.println(s1 == s2);

        System.out.println(s1 == s3);

        System.out.println(s1.equals(s3));
    }
}
