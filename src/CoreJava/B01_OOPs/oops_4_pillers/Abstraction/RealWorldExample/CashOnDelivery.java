package CoreJava.B01_OOPs.oops_4_pillers.Abstraction.RealWorldExample;

public class CashOnDelivery extends Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Cash Payment of ₹" + amount + " on Delivery");
    }
}