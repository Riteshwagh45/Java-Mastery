package CoreJava.B01_OOPs.AccessModifiers.DifferentPackage_05.package1;

public class Package1Demo {

    public static void main(String[] args) {

        Person p = new Person();

        System.out.println("===== SAME PACKAGE =====");

        // NOT Accessible
        // System.out.println(p.privateName);

        // Accessible
        System.out.println(p.defaultName);
        System.out.println(p.protectedName);
        System.out.println(p.publicName);

        // NOT Accessible
        // p.privateMethod();

        // Accessible
        p.defaultMethod();
        p.protectedMethod();
        p.publicMethod();

    }

}