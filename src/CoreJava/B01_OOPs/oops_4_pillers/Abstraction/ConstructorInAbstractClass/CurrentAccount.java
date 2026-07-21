package CoreJava.B01_OOPs.oops_4_pillers.Abstraction.ConstructorInAbstractClass;

public class CurrentAccount extends BankAccount{

    public CurrentAccount() {
        System.out.println("CurrentAccount Constructor is Called....");
    }

    @Override
    public void payMent() {
        System.out.println("CurrentAccount Payement is done....");
    }
}
