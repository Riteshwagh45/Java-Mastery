package CoreJava.F01_Java8.BuiltInFunctionalInterfaces.Consumer;
import java.util.function.Supplier;

public class RandomNumbers {
    static void main(String[] args) {

        Supplier<Double> RandomNumber = () -> Math.random();

        int i = 1;
        while (i <= 5) {
            System.out.println(RandomNumber.get());
            i++;
        }
    }
}
