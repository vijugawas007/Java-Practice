package org.practice.java.inheritance;

public class ATMCashWithdrawal extends CashWithdrawal {
    public ATMCashWithdrawal() {
        System.out.println("ATM Constructor");
    }

    @Override
    public String withdrawCash() {
        return "Cash Withdraw from ATM";
    }
}
