package CoreJava.A02_Operators;

import java.util.Scanner;

public class MakeLastDigitZero {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
            a = (a / 10 ) * 10;
        System.out.println(a);
    }
}
