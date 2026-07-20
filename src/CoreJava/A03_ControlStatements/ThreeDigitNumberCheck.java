package CoreJava.A03_ControlStatements;

public class ThreeDigitNumberCheck {
    static void main(String[] args) {
        int n = 123;
        int ans = 0;

        while(n > 0){
            ans++;
            n = n/10;
        }
        if(ans == 3){
            System.out.println("3 digit number");
        }
        else{
            System.out.println("not 3 digit number");
        }
    }
}
