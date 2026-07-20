package CoreJava.B01_OOPs.oops_4_pillers.Encapsulation;

public class BankAccount {

    //==============================
    // Private Fields
    //==============================

    private final long accountNumber;
    private String accountHolderName;
    private double balance;

    //==============================
    // Constructor
    //==============================

    public BankAccount(long accountNumber,
                       String accountHolderName,
                       double openingBalance) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;

        if (openingBalance < 0) {
            System.out.println("Opening balance cannot be negative.");
            this.balance = 0;
        } else {
            this.balance = openingBalance;
        }
    }

    //==============================
    // Getter Methods
    //==============================

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    //==============================
    // Setter
    //==============================

    public void setAccountHolderName(String accountHolderName) {

        if (accountHolderName == null || accountHolderName.trim().isEmpty()) {
            System.out.println("Invalid Account Holder Name");
            return;
        }

        this.accountHolderName = accountHolderName;
    }

    /*
        Notice:

        There is NO

        setBalance()

        because balance should only change
        through business methods.
     */

    //==============================
    // Business Methods
    //==============================

    public void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than zero.");
            return;
        }

        balance += amount;

        System.out.println("Deposit Successful.");
    }

    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient Balance.");
            return;
        }

        balance -= amount;

        System.out.println("Withdrawal Successful.");
    }

    public void checkBalance() {

        System.out.println("--------------------------------");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + accountHolderName);
        System.out.println("Balance        : ₹" + balance);
        System.out.println("--------------------------------");

    }

}