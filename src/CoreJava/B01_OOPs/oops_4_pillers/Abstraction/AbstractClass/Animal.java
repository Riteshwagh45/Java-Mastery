package CoreJava.B01_OOPs.oops_4_pillers.Abstraction.AbstractClass;

public abstract class Animal {

    //variables
    //Abstract class have Variables
    int a = 10;
    String name = "ritesh";

    //Constructor: Abstract class have a Constructor
    Animal(){
        System.out.println("Constructor of Abstract class is called");
    }

    //normal Method : is also known as Concreate Methods : Allow
    public void run(){
        System.out.println("I am Run...");
    }

    //static methods : Allow
    public static void stat(){
        System.out.println("I am static methods....");
    }

    //final methods  : Allow
    public final void fin(){
        System.out.println("I am final Method");
    }
}
