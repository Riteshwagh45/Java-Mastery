package CoreJava.B01_OOPs.oops_4_pillers.Polymorphism.MethodOverRiding;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Dog is Eating");
    }

    @Override
    public void sound() {
        System.out.println("Dog is sounding....");
    }
}
