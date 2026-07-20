package CoreJava.B01_OOPs.Constructor.PrivateConstructor;

/*
    Singleton Class

    Only one object of this class
    can exist.
*/

public class Singleton {

    // Step 1
    private static Singleton object;

    // Step 2
    private Singleton() {

        System.out.println("Singleton Constructor Called");

    }

    // Step 3
    public static Singleton getInstance() {

        if (object == null) {

            object = new Singleton();

        }

        return object;

    }

    void show() {

        System.out.println("Singleton Object");

    }

}