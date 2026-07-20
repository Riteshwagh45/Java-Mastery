package CoreJava.A02_Operators;

public class SwappingWithThirdVariable {
    static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before Swapping : " +a +", " +b);
        //swapping
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping : " +a +", " +b);
    }
}
