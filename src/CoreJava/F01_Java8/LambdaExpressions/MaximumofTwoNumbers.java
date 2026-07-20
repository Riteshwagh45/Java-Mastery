package CoreJava.F01_Java8.LambdaExpressions;

public class MaximumofTwoNumbers {
    interface maximumOfTwo{
        int getMax(int a , int b);
    }

    static void main(String[] args) {
        maximumOfTwo obj = (int a , int b) ->{

         return Math.max(a,b);
        };
        System.out.println(obj.getMax(10,20));
    }
}
