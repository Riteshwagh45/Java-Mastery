package CoreJava.F01_Java8.BuiltInFunctionalInterfaces.Function;

import java.util.function.Function;

public class FindSqaure {
    static void main(String[] args) {
        Function<Integer,Integer> sqaure = number -> number * number;

        System.out.println(sqaure.apply(10));
    }
}
