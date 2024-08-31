package org.practice.java.coding;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparableComparator {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(1141);
        list.add(15422);
        list.add(123333);
        list.add(5414444);
        list.add(64144444);
        list.add(143555555);
        list.add(814666666);
        list.add(114666666);

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        System.out.println(list);

       list.stream().sorted(new Comparator<Integer>() {
           @Override
           public int compare(Integer o1, Integer o2) {
               return o1-o2;
           }
       }).forEach(s-> System.out.print(" "+s+" "));



    }
}
