package CoreJava.F01_Java8.Functionalinterfaces;

public class GreetingDemo {

    @FunctionalInterface
    interface Greeting {
        void greet(String name);
    }

    static void main(String[] args) {

        Greeting obj = name ->
                System.out.println("Hello " + name);

        obj.greet("Ritesh");
    }
}