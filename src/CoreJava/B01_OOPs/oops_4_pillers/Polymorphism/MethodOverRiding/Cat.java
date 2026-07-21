package CoreJava.B01_OOPs.oops_4_pillers.Polymorphism.MethodOverRiding;

public class Cat extends Animal{

    @Override
    public void sound() {
        System.out.println("cat is sound... ");
    }

    @Override
    public void eat() {
        System.out.println("cat is sounding....");
    }
}
