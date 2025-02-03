abstract class PaymentMethod {
    public abstract void processPayment();
}

class CreditCard extends PaymentMethod {
    
    public void processPayment() {
        System.out.println(" Payment process through Credit Card has  3% transaction fee.");
    }
}

class PayPal extends PaymentMethod {
    
    public void processPayment() {
        System.out.println("Payment process through PayPal has no transaction fee.");
    }
}

public class PaymentSystem {
    public static void processTransaction(PaymentMethod paymentMethod) {
        System.out.println("Initiating payment...");
        paymentMethod.processPayment();
    }

    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCard();
        PaymentMethod paypal = new PayPal();

        processTransaction(creditCard);
        System.out.println();
        processTransaction(paypal);
    }
}
