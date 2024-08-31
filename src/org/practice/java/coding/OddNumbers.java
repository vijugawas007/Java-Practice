package org.practice.java.coding;

import java.util.List;
import java.util.stream.Collectors;

public class OddNumbers {


    public static void main(String[] args) {

       List<Integer> lst = List.of(1,3,5,9,7,1,1,1,2);


        System.out.println(lst.parallelStream().anyMatch(s-> s % 2 == 0));
    }
}
