package CoreJava.F01_Java8.LambdaExpressions;

public class EvenorOdd {
    interface EvenOdd{
        String getEvenOdd(int a);
    }

    static void main(String[] args) {
        EvenOdd obj = (int a) -> {
            String ans = null;

            if(a == 0){
                return "Zero";
            }

            if (a % 2 == 0){
                ans = "Even";
            }
            else{
                ans = "odd";
            }
            return ans;
        };
        System.out.println(obj.getEvenOdd(10));

    }
}
