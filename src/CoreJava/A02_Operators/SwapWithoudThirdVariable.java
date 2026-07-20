package CoreJava.A02_Operators;

public class SwapWithoudThirdVariable {
    static void main(String[] args) {
        int a = 20;
        int b = 10;

        System.out.println("Before Swap : " +a + "," +b);
        //swapping using + , - operators
         /*
         a = a + b;
         b = a - b;
         a = a - b;
          */

         //swapping with * , / operators
        /*
        a = a * b;
        b = a / b;
        a = a / b;
         */

        //swapping using XOR operator
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After Swap : " +a +"," +b);
    }
}
