interface PaymentGateway {
    void makePayment(double amount);
}

class CreditCardPayment implements PaymentGateway {
    @Override
    public void makePayment(double amount) {
        System.out.printf("Processing credit card payment of Rs. %.2f%n", amount);
    }
}

class PayPalPayment implements PaymentGateway {
    @Override
    public void makePayment(double amount) {
        System.out.printf("Processing PayPal payment of Rs. %.2f%n", amount);
    }
}

class UPIPayment implements PaymentGateway {
    @Override
    public void makePayment(double amount) {
        System.out.printf("Processing UPI payment of Rs. %.2f%n", amount);
    }
}

public class PaymentGatewayDemo {
    public static void main(String[] args) {
        PaymentGateway[] methods = {
            new CreditCardPayment(),
            new PayPalPayment(),
            new UPIPayment()
        };
        double[] amounts = { 2500.0, 1800.0, 950.0 };

        for (int i = 0; i < methods.length; i++) {
            methods[i].makePayment(amounts[i]);
        }
    }
}
