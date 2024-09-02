package org.practice.java.coding;

public class SingletonMain {
    public static void main(String[] args) {
        SingletonPractice practice = SingletonPractice.getInstance();
        System.out.println(practice.hashCode());

        SingletonPractice practice2 = SingletonPractice.getInstance();
        System.out.println(practice2.hashCode());

//        SingletonPractice practice = new SingletonPractice();
//        System.out.println(practice.getInstance().hashCode());
//
//        SingletonPractice practice2 = new SingletonPractice();
//        System.out.println(practice2.getInstance().hashCode());
    }
}
