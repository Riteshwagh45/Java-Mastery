package CoreJava.B01_OOPs.Constructor.Constructor_07_SuperConstructor;

public class SuperConstructorDemo {

    public static void main(String[] args) {

        System.out.println("======= SUPER CONSTRUCTOR =======");

        System.out.println();

        Dog d1 = new Dog();

        System.out.println();

        Dog d2 =
                new Dog("Tommy",
                        3,
                        "Labrador");

        System.out.println();

        d2.displayDog();

        System.out.println();

        Cat c1 =
                new Cat("Kitty",
                        2,
                        "White");

        System.out.println();

        c1.displayCat();

    }

}