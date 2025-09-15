package adapter;

import java.math.BigDecimal;

/*
 * BankAdapter is the middleman between our app and the BankApi.
 *
 * Our app talks in terms of PaymentProcessor (dollars + currency),
 * but BankApi only understands cents and only works with USD.
 *
 * So whenever pay() is called:
 *  - it checks if the currency is USD,
 *  - converts the BigDecimal amount into cents,
 *  - and then calls the BankApi to finish the job.
 *
 * This way, the rest of the code doesn’t care about BankApi’s details.
 * It just calls PaymentProcessor and BankAdapter takes care of the translation.
 */

public class BankAdapter implements PaymentProcessor{
    private final BankApi bank;

    public BankAdapter(BankApi bank) {
        this.bank = bank;
    }
    public void pay(String fromAccount, String toAccount, BigDecimal amount, String currency){
        if(!"USD".equalsIgnoreCase(currency)){
            throw new UnsupportedOperationException("Bank only supports USD");
        }
        int cents = amount.multiply(BigDecimal.valueOf(100)).intValue();
        bank.sendMoney(fromAccount, toAccount, cents);
    }
}
