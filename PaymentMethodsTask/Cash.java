package PaymentMethodsTask;

import java.math.BigDecimal;

public class Cash extends PaymentMethods {
    public Cash(BigDecimal balance) {
        super(balance);
    }

    public boolean pay(BigDecimal amount) {
        System.out.println("оплата наличными");
        BigDecimal curBalance = super.getBalance();
        boolean possibleToPay = amount.compareTo(curBalance) <= 0; // amount <= curBalance;
        System.out.println("Средсва: " + curBalance);

        if (possibleToPay) {
            super.setBalance(curBalance.subtract(amount));
            System.out.println("заплачено: " + super.getBalanceInDecimalFormat(amount));
            System.out.println("Осталось: " + super.getBalanceInDecimalFormat(super.getBalance()));
        } else {
            System.out.println("не хватает средств");
        }
        return possibleToPay;

    }
}
