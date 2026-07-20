package CoreJava.A02_Operators;

import java.util.Scanner;

public class PrintWithoutLastDigit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int n = sc.nextInt();

        System.out.println("Without last digit : " + n/10);
    }
}
