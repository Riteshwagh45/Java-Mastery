package CoreJava.B01_OOPs.oops_4_pillers.Encapsulation;

public class Validation_03 {

    public static void main(String[] args) {

        BankAccount account =
                new BankAccount(1001001,
                        "Ritesh",
                        10000);

        account.checkBalance();

        account.deposit(5000);

        account.withdraw(3000);

        account.withdraw(50000);

        account.deposit(-100);

        account.checkBalance();

    }

}