package CoreJava.B01_OOPs.AccessModifiers.DifferentPackage_05.package2;

import CoreJava.B01_OOPs.AccessModifiers.DifferentPackage_05.package1.Person;

/*
 * Employee extends Person.
 * Used to demonstrate protected access
 * from another package.
 */

public class Employee extends Person {

    public void showDetails() {

        System.out.println("===== DIFFERENT PACKAGE + INHERITANCE =====");

        // NOT Accessible
        // System.out.println(privateName);

        // NOT Accessible
        // System.out.println(defaultName);

        // Accessible
        System.out.println(protectedName);

        // Accessible
        System.out.println(publicName);

        // NOT Accessible
        // privateMethod();

        // NOT Accessible
        // defaultMethod();

        // Accessible
        protectedMethod();

        // Accessible
        publicMethod();

    }

}