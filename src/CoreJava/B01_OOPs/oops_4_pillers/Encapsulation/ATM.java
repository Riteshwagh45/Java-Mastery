package CoreJava.B01_OOPs.oops_4_pillers.Encapsulation;

/**
 * ------------------------------------------
 * Topic : Write Only Class
 *
 * Sensitive data (ATM PIN) can be written
 * but cannot be read directly.
 * ------------------------------------------
 */
public class ATM {

    //==============================
    // Private Field
    //==============================

    private int pin;

    //==============================
    // Setter Method
    //==============================

    public void setPin(int pin) {

        if (pin < 1000 || pin > 9999) {
            System.out.println("Invalid PIN. PIN must be 4 digits.");
            return;
        }

        this.pin = pin;
        System.out.println("PIN Set Successfully.");
    }

    //==============================
    // Business Method
    //==============================

    public boolean verifyPin(int enteredPin) {

        return this.pin == enteredPin;

    }

}