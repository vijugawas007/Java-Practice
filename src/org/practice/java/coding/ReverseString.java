package org.practice.java.coding;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {

        String str = "This is Reverse";

        StringBuilder stringBuilder = new StringBuilder(str);
        var reverse = stringBuilder.reverse();
        System.out.println(reverse);
        System.out.println("------------------------------------------------------");
        String[] rev = str.split(" ");
        for (int i = rev.length - 1; i >= 0 ; i--) {
            System.out.println(rev[i]);
        }
        Arrays.stream(rev).forEach(System.out::println);

        int a = 10;
        int b = 20;
        b=a+b;//30
        a=b-a;//20
        b=b-a;//10

        System.out.println( str.toLowerCase().matches(".*[aeiou].*"));
        System.out.println("a = "+a + " b = "+b);

    }
}
