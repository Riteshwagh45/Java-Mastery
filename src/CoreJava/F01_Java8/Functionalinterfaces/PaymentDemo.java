package CoreJava.F01_Java8.Functionalinterfaces;

public class PaymentDemo {

    @FunctionalInterface
    interface Payment {

        void pay(double amount);

        default void receipt() {
            System.out.println("Receipt generated");
        }

        static void rules() {
            System.out.println("Follow payment rules");
        }
    }

    static void main(String[] args) {

        Payment obj = amount ->
                System.out.println("Paid: " + amount);

        obj.pay(1000);

        obj.receipt();

        Payment.rules();
    }
}