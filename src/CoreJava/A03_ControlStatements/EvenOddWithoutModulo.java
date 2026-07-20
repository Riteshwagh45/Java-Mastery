package CoreJava.A03_ControlStatements;

import java.util.Scanner;

public class EvenOddWithoutModulo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n = sc.nextInt();
        int temp = n / 2;

        if(temp + temp == n){
            System.out.println("Even Number ");
        }

        else{
            System.out.println("Odd number ");
        }
    }
}
