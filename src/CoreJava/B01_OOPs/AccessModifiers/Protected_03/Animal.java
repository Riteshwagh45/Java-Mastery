package CoreJava.B01_OOPs.AccessModifiers.Protected_03;

/*
 * Protected members can be accessed:
 * 1. Inside the same class
 * 2. Inside the same package
 * 3. In subclasses (inheritance)
 */

public class Animal {

    protected String name;
    protected int age;

    // Protected Constructor
    protected Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Protected Method
    protected void eat() {
        System.out.println(name + " is eating.");
    }

    // Public Method
    public void display() {
        System.out.println("Animal Name : " + name);
        System.out.println("Animal Age  : " + age);
    }

}