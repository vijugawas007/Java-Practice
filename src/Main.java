import org.practice.java.inheritance.ATMCashWithdrawal;
import org.practice.java.inheritance.CashWithdrawal;
import org.practice.java.inheritance.Currency;
import org.practice.java.inheritance.OnlineCashWithdrawal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        OnlineCashWithdrawal withdrawal = new OnlineCashWithdrawal();
        System.out.println(withdrawal.withdrawCash());
        System.out.println(withdrawal.typeofCurrency());
        System.out.println("--------------------------------------------------------------");
        CashWithdrawal atmCashWithdrawal = new ATMCashWithdrawal();
        System.out.println(atmCashWithdrawal.withdrawCash());
        System.out.println(atmCashWithdrawal.typeofCurrency());
        System.out.println("--------------------------------------------------------------");
        CashWithdrawal atmCashWithdrawal2 = new ATMCashWithdrawal();
        System.out.println(atmCashWithdrawal2.withdrawCash());
        System.out.println( Currency.str +" " + Currency.typeofCurrency2());

    }
}