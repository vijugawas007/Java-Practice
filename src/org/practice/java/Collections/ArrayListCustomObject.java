package org.practice.java.Collections;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayListCustomObject {

    public static void main(String[] args) {

        CashWithdrawal c1 = new CashWithdrawal("Online",15000);
        CashWithdrawal c2 = new CashWithdrawal("Cash",11000);
        CashWithdrawal c3 = new CashWithdrawal("UPI",12000);
        CashWithdrawal c4 = new CashWithdrawal("Card",13000);
        CashWithdrawal c5 = new CashWithdrawal("Online",15000);
        CashWithdrawal c6 = new CashWithdrawal("Online",15000);
        CashWithdrawal c7 = new CashWithdrawal("Online",15200);
        CashWithdrawal c8 = new CashWithdrawal("Card",17000);

        List<CashWithdrawal> withdrawals = new ArrayList<>();
        withdrawals.add(c1);
        withdrawals.add(c2);
        withdrawals.add(c3);
        withdrawals.add(c4);
        withdrawals.add(c5);
        withdrawals.add(c6);
        withdrawals.add(c7);
        withdrawals.add(c8);


        System.out.println("---------------------------------------------------------");
        System.out.println("Total Online Cash Withdrawal - ");
        IntSummaryStatistics totalAmountofOnline =  withdrawals.stream().filter(s->s.getMethod().equals("Online")).collect(Collectors.summarizingInt(CashWithdrawal::getAmount));
        System.out.println("Online Cash Withdrawal - "+ totalAmountofOnline.getSum());
        System.out.println("---------------------------------------------------------");

        Map<String,List<CashWithdrawal>> map = withdrawals.stream()
                .collect(Collectors.groupingBy(CashWithdrawal::getMethod));

        System.out.println("Print Map with grouping Elements ");
        map.entrySet().stream().forEach(s-> System.out.println(s.getKey() + " - " + s.getValue()));

        System.out.println("---------------------------------------------------------");
        System.out.println("Total amount Method wize");
        for (Map.Entry<String, List<CashWithdrawal>> entry: map.entrySet()){
            Integer totalAmount = 0;
           List<CashWithdrawal> lst = entry.getValue();
           for(CashWithdrawal cashWithdrawal : lst){
               totalAmount = totalAmount+ cashWithdrawal.getAmount();
           }

            System.out.println(entry.getKey()+" : " + totalAmount);

        }
        System.out.println("---------------------------------------------------------");
    }
}
