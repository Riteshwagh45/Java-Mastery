package CoreJava.F01_Java8.BuiltInFunctionalInterfaces.Predicate;

import java.util.function.Predicate;

public class PassWordLen {
    static void main(String[] args) {
        Predicate<String> validPassword = password -> password.length() >= 8;

        System.out.println(validPassword.test("java")); // false
        System.out.println(validPassword.test("Ritesh123")); //true

    }
}
