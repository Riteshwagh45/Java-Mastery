package CoreJava.B01_OOPs.oops_4_pillers.Abstraction.Interface;

public class InterfaceInheritance {
    interface Animal{
        void eat();
    }
    interface Pet extends Animal{
        void play();
    }

    static class Dog implements Pet{
        public void eat(){
            System.out.println("dog can eat...");
        }
        public void play(){
            System.out.println("Dog can play...");

        }
    }

    static void main(String[] args) {
        Pet obj = new Dog();
        obj.eat();
        obj.play();
    }
}
