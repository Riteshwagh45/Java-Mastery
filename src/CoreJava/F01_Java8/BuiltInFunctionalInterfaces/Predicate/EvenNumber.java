package CoreJava.F01_Java8.BuiltInFunctionalInterfaces.Predicate;

import java.util.function.Predicate;

public class EvenNumber {
    static void main(String[] args) {
        Predicate<Integer> isEven = number -> number % 2 == 0;

        System.out.println(isEven.test(10)); // true
        System.out.println(isEven.test(11)); //false
    }
}
