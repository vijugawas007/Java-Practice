package org.practice.java.inheritance;

public abstract class CashWithdrawal implements Currency{

    public CashWithdrawal() {
        System.out.println("Cash Controller");
    }

    public abstract String withdrawCash();
}
