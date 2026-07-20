package CoreJava.A02_Operators;

import java.util.Scanner;

public class SumOfDigits {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        int sum = 0;

        while(n > 0){
            int r = n % 10;
            sum += r;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
