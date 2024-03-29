package PaymentMethodsTask;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public abstract class PaymentMethods {
    private DecimalFormat decimalFormat = new DecimalFormat("#.##");
    private BigDecimal balance;

    protected PaymentMethods(BigDecimal balance) {
        setBalance(balance);
    }

    public abstract boolean pay(BigDecimal amount);

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
        // import java.text.DecimalFormat;
        // double number = 123.4567;
        // DecimalFormat decimalFormat = new DecimalFormat("#.##");
        // String roundedNumber = decimalFormat.format(number);
    }

    public String getBalanceInDecimalFormat(BigDecimal price) {
        return decimalFormat.format(price);
    }

}
