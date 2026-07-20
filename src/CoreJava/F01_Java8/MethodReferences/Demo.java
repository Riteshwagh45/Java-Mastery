package CoreJava.F01_Java8.MethodReferences;
import java.util.function.Consumer;

public class Demo {
    static void main(String[] args) {
        Consumer<String> obj = System.out::println;

        obj.accept("ritesh");

        //:: the symbol is a method reference operator
    }
}
