package CoreJava.B01_OOPs.AccessModifiers.Public_04;

/*
 * Public Class
 * This class can be accessed from any package.
 */

public class College {

    // Public Variable
    public String collegeName;

    // Public Constructor
    public College(String collegeName) {
        this.collegeName = collegeName;
    }

    // Public Method
    public void displayCollege() {

        System.out.println("College Name : " + collegeName);

    }

}