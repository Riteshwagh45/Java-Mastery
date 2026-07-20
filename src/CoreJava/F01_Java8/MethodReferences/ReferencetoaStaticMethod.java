package CoreJava.F01_Java8.MethodReferences;

import java.util.function.Function;

public class ReferencetoaStaticMethod {

    public static int square(Integer number) {
        return number * number;
    }

    static void main(String[] args) {

        Function<Integer, Integer> obj =
                ReferencetoaStaticMethod::square;

        System.out.println(obj.apply(10));
    }
}