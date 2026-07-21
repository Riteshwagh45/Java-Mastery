package CoreJava.B01_OOPs.oops_4_pillers.Abstraction.RealWorldExample;

public class Upi extends Payment{

    @Override
    public void pay(double amount) {
        System.out.println("paid ₹ " + amount +" using UPI");
    }
}
