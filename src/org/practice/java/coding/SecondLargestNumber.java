package org.practice.java.coding;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestNumber {

    public static void main(String[] args) {

        Integer [] arr = {2,3,4,6,7,1,66,77,44,33,88,98,90};

        System.out.println(Arrays.stream(arr).distinct().sorted(Comparator.reverseOrder()).skip(2).findFirst().get());
        System.out.println(Arrays.stream(arr).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
    }
}


