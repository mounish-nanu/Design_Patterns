package adapter;

/*
 * BankApi is the existing service we already have.
 *
 * It’s pretty basic: it can transfer money, but only if we give it the amount
 * in cents (int) and it doesn’t worry about different currencies.
 *
 * This class is what we call the "adaptee" in the adapter pattern.
 * It works fine on its own, but its method signature doesn’t match
 * what our app (and PaymentProcessor) expects.
 *
 * That’s why we write BankAdapter — to make this class usable
 * without changing its code.
 */

public class BankApi {
    void sendMoney(String src, String dest, int amountInCents){
        System.out.println("sending money from " + src + " to " + dest + " with amount " + amountInCents);
    }
}
