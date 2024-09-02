package org.practice.java.Collections;


import java.util.Objects;

public class CashWithdrawal {

    private String method;
    private int amount;

    public CashWithdrawal(String method, int amount) {
        this.method = method;
        this.amount = amount;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
       if(this.getMethod().equals(((CashWithdrawal)o).getMethod())
            && this.getAmount() == (((CashWithdrawal)o).getAmount())){
           return true;
       }else {
           return false;
       }
    }

    @Override
    public int hashCode() {
        return Objects.hash(method, amount);
    }

    @Override
    public String toString() {
        return "CashWithdrawal{" +
                "method='" + method + '\'' +
                ", amount=" + amount +
                '}';
    }
}
