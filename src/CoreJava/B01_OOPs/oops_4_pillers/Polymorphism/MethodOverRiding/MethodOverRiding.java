package CoreJava.B01_OOPs.oops_4_pillers.Polymorphism.MethodOverRiding;

public class MethodOverRiding {
    static void main(String[] args) {
        Animal A = new Animal();
        A.eat();
        A.sound();

        System.out.println("========================================");

        Cat C = new Cat();
         C.eat();
         C.sound();

        System.out.println("========================================");

         Dog d = new Dog();
         d.eat();
         d.sound();
    }
}
