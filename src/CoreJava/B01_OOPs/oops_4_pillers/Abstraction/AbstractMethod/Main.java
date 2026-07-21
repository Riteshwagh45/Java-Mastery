package CoreJava.B01_OOPs.oops_4_pillers.Abstraction.AbstractMethod;

public class Main {
    static void main(String[] args) {
        Developer d1 = new Developer();
        Managaer m1 = new Managaer();

        d1.calculateSalary();
        System.out.println("=====================================");
        m1.calculateSalary();
    }
}
