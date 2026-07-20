package CoreJava.F01_Java8.BuiltInFunctionalInterfaces.Function;
import java.util.function.Function;

public class Demo {
    static void main(String[] args) {
        Function<String,Integer> obj = number -> number.length();

        System.out.println(obj.apply("ritesh"));
    }
}
