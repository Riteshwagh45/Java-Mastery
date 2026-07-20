package CoreJava.F01_Java8.Functionalinterfaces;

public class Calculator {

    @FunctionalInterface
    interface CalculatorIn {
        void calculate(int a, int b);
    }

    static void main(String[] args) {

        // Addition
        CalculatorIn add = (a, b) -> {
            System.out.println(a + b);
        };

        // Multiplication
        CalculatorIn multi = (a, b) -> {
            System.out.println(a * b);
        };

        // Division
        CalculatorIn div = (a, b) -> {
            System.out.println(a / b);
        };

        // Subtraction
        CalculatorIn sub = (a, b) -> {
            System.out.println(a - b);
        };

        add.calculate(10, 5);
        multi.calculate(10, 5);
        div.calculate(10, 5);
        sub.calculate(10, 5);
    }
}