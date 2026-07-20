package CoreJava.F01_Java8.LambdaExpressions;

public class SimpleMessage {

    interface Message{
        void show();
    }

    static void main(String[] args) {
        Message obj = () -> {
            System.out.println("hiii simple msg...");
        };
        obj.show();
    }
}
