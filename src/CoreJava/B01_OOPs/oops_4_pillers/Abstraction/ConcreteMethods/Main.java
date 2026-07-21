package CoreJava.B01_OOPs.oops_4_pillers.Abstraction.ConcreteMethods;

import CoreJava.B01_OOPs.oops_4_pillers.Abstraction.AbstractMethod.Managaer;

public class Main {
    static void main(String[] args) {
        Developer d1 = new Developer();
        Manager m1  = new Manager();

        d1.companyName();
        d1.attendanceRule();
        d1.calculateSalary();

        System.out.println("=====================================");

        m1.companyName();
        m1.attendanceRule();
        m1.calculateSalary();


    }
}
