package CoreJava.A03_ControlStatements;

public class CheckCharacter {
    static void main(String[] args) {
        char ch = '9';

        if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z'){
            System.out.println("alphabet");
        }

        else if(ch >= '0' && ch <= '9'){
            System.out.println("Digit");
        }

        else{
            System.out.println("Other");
        }
    }
}
