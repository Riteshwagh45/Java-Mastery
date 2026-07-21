package CoreJava.B01_OOPs.oops_4_pillers.Abstraction.ConstructorInAbstractClass;

public class SavingAccount extends BankAccount {

    public SavingAccount() {
        System.out.println("SavingAccount Constructor is Called.... ");
    }

    @Override
    public void payMent() {
        System.out.println("SavingAccount Payment is done.....");
    }
}
