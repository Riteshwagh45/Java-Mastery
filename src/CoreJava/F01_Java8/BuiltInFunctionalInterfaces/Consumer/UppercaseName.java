package CoreJava.F01_Java8.BuiltInFunctionalInterfaces.Consumer;
import java.util.function.Consumer;

public class UppercaseName {
    static void main(String[] args) {

        Consumer<String> obj = name -> System.out.println(name.toUpperCase());
         obj.accept("ritesh");
    }
}
