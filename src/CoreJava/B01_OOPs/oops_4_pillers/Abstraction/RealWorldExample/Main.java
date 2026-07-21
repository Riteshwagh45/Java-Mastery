package CoreJava.B01_OOPs.oops_4_pillers.Abstraction.RealWorldExample;

public class Main {
    static void main(String[] args) {

        Payment payment;

        payment = new Upi();
        payment.pay(599);

        System.out.println("=============================");

        payment = new CreditCard();
        payment.pay(1000);

        System.out.println("=============================");

        payment = new CashOnDelivery();
        payment.pay(1500);

    }
}
