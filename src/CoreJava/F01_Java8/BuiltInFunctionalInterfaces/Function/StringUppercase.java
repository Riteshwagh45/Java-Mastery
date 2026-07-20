package CoreJava.F01_Java8.BuiltInFunctionalInterfaces.Function;

import java.util.function.Function;

public class StringUppercase {
    static void main(String[] args) {
        Function<String,String> uppercase = str -> str.toUpperCase();

        System.out.println(uppercase.apply("ritesh"));
    }
}
