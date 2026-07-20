package CoreJava.B01_OOPs.Constructor.Constructor_07_SuperConstructor;

/*
    Parent Class

    super() is used to call
    this constructor from child classes.
*/

public class Animal {

    String name;
    int age;

    Animal() {

        System.out.println("Animal Default Constructor");

    }

    Animal(String name, int age) {

        this.name = name;
        this.age = age;

        System.out.println("Animal Parameterized Constructor");

    }

    void displayAnimal() {

        System.out.println("Animal Name : " + name);
        System.out.println("Animal Age  : " + age);

    }

}