package CoreJava.B01_OOPs.oops_4_pillers.Encapsulation;

public class ReadOnlyClass_04 {

    public static void main(String[] args) {

        Passport passport = new Passport(
                "X1234567",
                "Ritesh Wagh",
                "Indian",
                "15-08-2005",
                "01-01-2025",
                "01-01-2035"
        );

        passport.displayPassport();

        System.out.println("\nReading Individual Values\n");

        System.out.println("Passport Number : " + passport.getPassportNumber());
        System.out.println("Holder Name     : " + passport.getHolderName());
        System.out.println("Nationality     : " + passport.getNationality());
        System.out.println("Date Of Birth   : " + passport.getDateOfBirth());
        System.out.println("Issue Date      : " + passport.getIssueDate());
        System.out.println("Expiry Date     : " + passport.getExpiryDate());

        /*
         * There are NO setter methods.
         *
         * The following code will NOT compile:
         *
         * passport.setHolderName("ABC");
         * passport.setNationality("USA");
         * passport.setPassportNumber("P999999");
         *
         * This makes the object Read-Only.
         */
    }
}