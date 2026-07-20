package CoreJava.B01_OOPs.Constructor.PrivateConstructor;

public class PrivateConstructorDemo {

    public static void main(String[] args) {

        System.out.println("======= PRIVATE CONSTRUCTOR =======");

        /*
         * NOT ALLOWED
         *
         * Singleton s = new Singleton();
         *
         * Compile Time Error
         */

        Singleton s1 = Singleton.getInstance();

        Singleton s2 = Singleton.getInstance();

        System.out.println();

        s1.show();

        System.out.println();

        System.out.println("Reference 1 : " + s1);

        System.out.println("Reference 2 : " + s2);

        System.out.println();

        if (s1 == s2) {

            System.out.println("Only One Object Exists");

        }

        else {

            System.out.println("Different Objects");

        }

        System.out.println();

        System.out.println("Square : " + Utility.square(5));

        System.out.println("Cube : " + Utility.cube(5));

    }

}
