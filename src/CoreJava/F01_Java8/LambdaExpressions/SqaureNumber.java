package CoreJava.F01_Java8.LambdaExpressions;

public class SqaureNumber {
    interface Sqaure{
        int calculate(int number);
    }
    static void main(String[] args) {
     Sqaure obj = (int n) -> {
         return n * n;
     };
        System.out.println(obj.calculate(10));
    }
}
