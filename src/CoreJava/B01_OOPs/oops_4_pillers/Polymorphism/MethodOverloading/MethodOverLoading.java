package CoreJava.B01_OOPs.oops_4_pillers.Polymorphism.MethodOverloading;

public class MethodOverLoading {

    public static void main(String[] args) {

        Calculator cal = new Calculator();

        cal.add(10, 20);

        cal.add(10.5, 20.5);

        cal.add(10, 20, 30);

        cal.add("Hello ", "World");
    }
}