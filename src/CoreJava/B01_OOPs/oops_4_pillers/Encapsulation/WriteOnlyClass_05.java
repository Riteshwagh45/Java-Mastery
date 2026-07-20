package CoreJava.B01_OOPs.oops_4_pillers.Encapsulation;

public class WriteOnlyClass_05 {

    public static void main(String[] args) {

        ATM atm = new ATM();

        atm.setPin(1234);

        System.out.println();

        if (atm.verifyPin(1234)) {
            System.out.println("PIN Verified.");
        } else {
            System.out.println("Wrong PIN.");
        }

        System.out.println();

        if (atm.verifyPin(1111)) {
            System.out.println("PIN Verified.");
        } else {
            System.out.println("Wrong PIN.");
        }

        // ❌ Not Possible
        // System.out.println(atm.getPin());

    }

}