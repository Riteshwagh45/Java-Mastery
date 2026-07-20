package CoreJava.F01_Java8.BuiltInFunctionalInterfaces.Supplier;
import java.util.function.Supplier;
public class SupplyName {
    static void main(String[] args) {

        Supplier<String> obj = () -> "ritesh";
        System.out.println(obj.get());

    }
}
