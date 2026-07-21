package CoreJava.B01_OOPs.oops_4_pillers.Abstraction.ConstructorInAbstractClass;

public abstract class BankAccount {

    //constructor
    BankAccount(){
        System.out.println("BankAccount Constructor is called.... ");
    }

    //abstract method
    public abstract void payMent();
}
