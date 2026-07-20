package CoreJava.A03_ControlStatements;

import java.util.Scanner;

public class GetMaxTwo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Two Numbers :");

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b){
            System.out.println("Both are the same :");
        }
       else if(a > b){
            System.out.println(a +" is a Big");
        }
        else{
            System.out.println(b +" is a Big");
        }
    }
}
