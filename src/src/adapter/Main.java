package adapter;

import java.math.BigDecimal;

/*
 * Adapter design pattern is used when we don't want the client class (Main)
 * to be tightly coupled with some other service (BankApi).
 *
 * To solve this, we define an interface (PaymentProcessor) with the methods
 * we actually need in our application. Then we create an adapter class
 * (BankAdapter) which implements that interface and internally calls the
 * methods from the service (BankApi).
 *
 * This way, the client code just talks to PaymentProcessor and doesn’t
 * worry about the details of BankApi.
 */

public class Main {
    public static void main(String[] args) {
        BankApi bankApi = new BankApi();
        PaymentProcessor processor = new BankAdapter(bankApi);
        processor.pay("Acc-123", "Acc-456", new BigDecimal("100.00"), "USD");
    }
}
