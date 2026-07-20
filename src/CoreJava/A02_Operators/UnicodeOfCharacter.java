package CoreJava.A02_Operators;

import java.util.Scanner;

public class UnicodeOfCharacter {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Character : ");
        char ch = sc.next().charAt(0);

        System.out.println( (int) ch);
    }
}
