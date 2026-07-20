package CoreJava.A02_Operators;

import java.util.Scanner;

public class UnitDigit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int a = sc.nextInt();
        int unitDigit = a % 10;

        System.out.println("Unit Digit of " + a +" is " +unitDigit);
    }
}
