package CoreJava.B01_OOPs.Constructor.PrivateConstructor;

/*
    Utility Class

    Object creation is not required.
*/

public class Utility {

    private Utility() {

        System.out.println("Utility Constructor");

    }

    public static int square(int number) {

        return number * number;

    }

    public static int cube(int number) {

        return number * number * number;

    }

}
