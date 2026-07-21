package CoreJava.B01_OOPs.oops_4_pillers.Abstraction.Interface;

public class VariablesDefaultStaticMethods {

    interface Payment {

        // CoreJava.CoreJava.B01_OOPs.oops_4_pillers.Abstraction.Interface variable is automatically:
        // public static final
        double LIMIT = 50000;

        // Abstract method
        // public abstract automatically
        void pay(double amount);

        // Default method
        // Inherited by implementing class
        default void paymentInfo() {
            System.out.println("Payment service is available...");
        }

        // Static method
        // Belongs to the interface
        static void rules() {
            System.out.println("Rules from Payment interface...");
        }
    }

    static class UpiPayment implements Payment {

        // Implementation of abstract method
        @Override
        public void pay(double amount) {

            if (amount > 0 && amount <= LIMIT) {
                System.out.println("Payment successful: " + amount);
            } else {
                System.out.println("Invalid amount or payment limit exceeded...");
            }
        }

        // This is NOT overriding Payment.rules()
        // It is a separate static method of UpiPayment
        static void rules() {
            System.out.println("Rules from UpiPayment class...");
        }
    }

    static void main(String[] args) {

        UpiPayment obj = new UpiPayment();

        // Calling implemented abstract method
        obj.pay(1000);

        // Calling inherited default method
        obj.paymentInfo();

        // Calling interface static method
        Payment.rules();

        // Calling class static method
        UpiPayment.rules();

        System.out.println("----------------------");

        // CoreJava.CoreJava.B01_OOPs.oops_4_pillers.Abstraction.Interface reference with implementing class object
        Payment obj2 = new UpiPayment();

        // Allowed because pay() exists in Payment
        obj2.pay(2000);

        // Allowed because default method is inherited
        obj2.paymentInfo();

        // Static method must be called using interface name
        Payment.rules();

        // Not allowed:
        // obj2.rules();

        // Not allowed because LIMIT is final:
        // Payment.LIMIT = 60000;
    }
}