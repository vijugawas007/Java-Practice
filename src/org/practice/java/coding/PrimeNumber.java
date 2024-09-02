package org.practice.java.coding;

public class PrimeNumber {
    public static void main(String[] args) {

        Integer num = 78;

        PrimeNumber number = new PrimeNumber();
        System.out.println("Number is Prime - " + number.isPrimeNumber(num));

    }


    public boolean isPrimeNumber(Integer num){
        if(num == 0 || num == 1){
            return false;
        }
        if (num == 2)
            return true;

        for(int i=2;i <= num/2;i++){
            if (num%i == 0){
                return false;
            };
        }
        return true;
    }
}
