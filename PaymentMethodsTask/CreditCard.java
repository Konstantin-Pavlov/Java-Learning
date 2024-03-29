package PaymentMethodsTask;

import java.math.BigDecimal;

public class CreditCard extends Card {

    public CreditCard(BigDecimal balance) {
        super(balance);
        super.setLimit(BigDecimal.valueOf(25000));
    }

    @Override
    public boolean pay(BigDecimal amount) {
        // compareTo Returns: -1, 0, or 1 as this BigDecimal is numerically less than, equal to, or greater than val
        System.out.println("оплата кредитной картой");
        boolean succes = true;
        BigDecimal curBalance = super.getBalance();

        if (amount.compareTo(curBalance) <= 0) {
            System.out.println("С вашей кредитки списано " + super.getBalanceInDecimalFormat(amount));
            super.setBalance(curBalance.subtract(amount));

        } else if (amount.compareTo(curBalance.add(super.getLimit())) <= 0) {
            super.setBalance(BigDecimal.valueOf(0));
            super.setLimit(super.getLimit().subtract((curBalance.subtract(amount)).abs()));
            System.out.println("средств кредитки не хватило, с лимита списано " + super.getLimitInDecimalFormat());
        } else {
            System.out.println("не хватает средств кредитки и лимита чтобы оплатить");
            succes = false;
        }
        return succes;
    }
}
