package org.practice.java.inheritance;

public class OnlineCashWithdrawal extends CashWithdrawal {
    public OnlineCashWithdrawal() {
        System.out.println("Online Constructor");
    }
    @Override
    public String withdrawCash() {
        return "Cash Withdraw Online";
    }

    @Override
    public String typeofCurrency() {
        return "AUD";
    }
}
