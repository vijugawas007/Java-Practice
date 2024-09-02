package org.practice.java.coding;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci.fibonacchi(14);
        System.out.println("");
        int num = 10;
        for (int i = 0; i < num; i++) {
            System.out.print(fibonacchi2(i)*-1 +", ");

        }
    }

    public static void fibonacchi(int num){

        int a = 0;
        int b = 1;
        int c = 1;

        for(int i = 1; i<= num; i++){
            System.out.print(a+", ");
            a=b;
            b=c;
            c=a+b;
        }

    }

    public static int fibonacchi2(int num){

        if(num < 1)
            return num;

        return fibonacchi2(num-1) + fibonacchi2(num-2);

    }
}
