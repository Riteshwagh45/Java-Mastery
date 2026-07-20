package CoreJava.B01_OOPs.AccessModifiers.DifferentPackage_05.package2;

import CoreJava.B01_OOPs.AccessModifiers.DifferentPackage_05.package1.Person;

public class Package2Demo {

    public static void main(String[] args) {

        Person person = new Person();

        System.out.println("===== DIFFERENT PACKAGE =====");

        // NOT Accessible
        // System.out.println(person.privateName);

        // NOT Accessible
        // System.out.println(person.defaultName);

        // NOT Accessible
        // System.out.println(person.protectedName);

        // Accessible
        System.out.println(person.publicName);

        // NOT Accessible
        // person.privateMethod();

        // NOT Accessible
        // person.defaultMethod();

        // NOT Accessible
        // person.protectedMethod();

        // Accessible
        person.publicMethod();

        System.out.println();

        Employee emp = new Employee();

        emp.showDetails();

    }

}