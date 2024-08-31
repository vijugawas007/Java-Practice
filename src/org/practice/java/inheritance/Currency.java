package org.practice.java.inheritance;

public interface Currency {

    String str="100";

    default String typeofCurrency() {

        return "INR";
    }

    static String typeofCurrency2() {
        return "GBR";
    }

}
