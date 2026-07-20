package CoreJava.B01_OOPs.AccessModifiers.DifferentPackage_05.package1;

/*
 * This class contains all four access modifiers.
 */

public class Person {

    private String privateName = "Private";

    String defaultName = "Default";

    protected String protectedName = "Protected";

    public String publicName = "Public";

    //--------------------------------------------------

    private void privateMethod() {
        System.out.println("Private Method");
    }

    void defaultMethod() {
        System.out.println("Default Method");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    public void publicMethod() {
        System.out.println("Public Method");
    }

    //--------------------------------------------------

    public void accessInsideClass() {

        System.out.println("Inside Person Class");

        System.out.println(privateName);
        System.out.println(defaultName);
        System.out.println(protectedName);
        System.out.println(publicName);

        privateMethod();
        defaultMethod();
        protectedMethod();
        publicMethod();

    }

}