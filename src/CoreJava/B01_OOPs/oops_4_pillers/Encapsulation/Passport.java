package CoreJava.B01_OOPs.oops_4_pillers.Encapsulation;

/**
 * ----------------------------------------------------------
 * Topic : Read Only Class
 *
 * A Passport object is created once and cannot be modified.
 * Only getter methods are provided.
 * ----------------------------------------------------------
 */
public class Passport {

    //==============================
    // Private Final Fields
    //==============================

    private final String passportNumber;
    private final String holderName;
    private final String nationality;
    private final String dateOfBirth;
    private final String issueDate;
    private final String expiryDate;

    //==============================
    // Constructor
    //==============================

    public Passport(String passportNumber,
                    String holderName,
                    String nationality,
                    String dateOfBirth,
                    String issueDate,
                    String expiryDate) {

        this.passportNumber = passportNumber;
        this.holderName = holderName;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
    }

    //==============================
    // Getter Methods
    //==============================

    public String getPassportNumber() {
        return passportNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public String getNationality() {
        return nationality;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    //==============================
    // Display Method
    //==============================

    public void displayPassport() {

        System.out.println("\n========== PASSPORT DETAILS ==========");

        System.out.println("Passport Number : " + passportNumber);
        System.out.println("Holder Name     : " + holderName);
        System.out.println("Nationality     : " + nationality);
        System.out.println("Date Of Birth   : " + dateOfBirth);
        System.out.println("Issue Date      : " + issueDate);
        System.out.println("Expiry Date     : " + expiryDate);

        System.out.println("======================================");
    }
}