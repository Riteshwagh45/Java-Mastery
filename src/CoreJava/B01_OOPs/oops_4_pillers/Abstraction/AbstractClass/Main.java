package CoreJava.B01_OOPs.oops_4_pillers.Abstraction.AbstractClass;

public class Main {
    static void main(String[] args) {

        //upcasting
        Animal animal = new Dog();

        Animal.stat();
        animal.fin();
        animal.run();

        System.out.println("=============================");

        //downcasting
        Animal d = (Dog) animal;

    }
}
