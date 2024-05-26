
interface PaymentStrategy {
    boolean pay(double amount);
}


class CreditCardPayment implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.println("making payment using credit card");
        // do something
        return true;
    }
}


class PayPalPayment implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.println("making payment using PayPal");
        // do something
        return true;
    }
}

// BankPayment class
class BankPayment implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.println("making payment using bank");
        // do something
        return true;
    }
}


class BkashPayment implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.println("making payment using Bkash");
        // do something
        return true;
    }
}


public class imteaz{
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public boolean makePayment(double amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Payment strategy not set");
        }
        return paymentStrategy.pay(amount);
    }

    public static void main(String[] args) {
        imteaz paymentSystem = new imteaz();

        paymentSystem.setPaymentStrategy(new BankPayment());
        paymentSystem.makePayment(200);

        paymentSystem.setPaymentStrategy(new BkashPayment());
        paymentSystem.makePayment(500);

        paymentSystem.setPaymentStrategy(new CreditCardPayment());
        paymentSystem.makePayment(5500);
    }
}


