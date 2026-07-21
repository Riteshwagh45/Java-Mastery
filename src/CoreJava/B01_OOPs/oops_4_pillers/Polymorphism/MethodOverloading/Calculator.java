package CoreJava.B01_OOPs.oops_4_pillers.Polymorphism.MethodOverloading;

public class Calculator {

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void add(double a, double b) {
        System.out.println(a + b);
    }

    public void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public void add(String s1, String s2) {
        System.out.println(s1 + s2);
    }
}