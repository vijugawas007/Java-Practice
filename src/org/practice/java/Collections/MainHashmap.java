package org.practice.java.Collections;

import java.util.HashMap;

public class MainHashmap {
    public static void main(String[] args) {
        HashMap<CashWithdrawal, String> map = new HashMap<>();
        CashWithdrawal c1 = new CashWithdrawal("Online",15000);
        CashWithdrawal c2 = new CashWithdrawal("Cash",11000);
        CashWithdrawal c3 = new CashWithdrawal("UPI",12000);
        CashWithdrawal c4 = new CashWithdrawal("Card",13000);
        CashWithdrawal c5 = new CashWithdrawal("Online",15000);
        CashWithdrawal c6 = new CashWithdrawal("Online",15000);
        CashWithdrawal c7 = new CashWithdrawal("Online",15200);

        map.put(c1,"Completed");
        map.put(c2,"InProcess");
        map.put(c3,"Rejected");
        map.put(c4,"Completed");
        map.put(c5,"InProcess");
        map.put(c6,"Pending");
        map.put(c7,"InProcess");

        System.out.println(map.size());

        map.entrySet().stream().forEach(s-> System.out.println(s.getKey().getMethod()+" : "+s.getKey().getAmount() + " - "+s.getValue()));
    }

}
