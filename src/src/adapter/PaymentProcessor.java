package adapter;

import java.math.BigDecimal;

/*
 * PaymentProcessor is the interface that our application code depends on.
 *
 * Instead of directly calling a specific payment service (like BankApi or Stripe),
 * we define this interface with the method(s) we actually need.
 *
 * The idea is that any payment service (old or new) can be connected to our app
 * as long as it provides an implementation of this interface.
 *
 * This keeps the client code flexible — tomorrow we can plug in a different
 * payment provider just by writing another adapter, without changing Main or
 * the rest of the code that uses PaymentProcessor.
 */

public interface PaymentProcessor {
    void pay(String fromAccount, String toAccount, BigDecimal amount, String currency);
}
