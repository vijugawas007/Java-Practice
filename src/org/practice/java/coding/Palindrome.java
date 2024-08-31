package org.practice.java.coding;

public class Palindrome {

    public static void main(String[] args) {
        String str1 = "madam1";
        String str2 = new StringBuilder(str1).reverse().toString();
        System.out.println(str1.equals(str2));
        String str3 = " This is Prachi Gawde ";
        System.out.println(str3);
       str3 = str3.replace(" ","");
        System.out.println(str3);
    }
}
