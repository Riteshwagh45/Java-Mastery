package CoreJava.B01_OOPs.Constructor.Constructor_07_SuperConstructor;

/*
    Child Class
*/

public class Dog extends Animal {

    String breed;

    Dog() {

        super();

        System.out.println("Dog Default Constructor");

    }

    Dog(String name, int age, String breed) {

        super(name, age);

        this.breed = breed;

        System.out.println("Dog Parameterized Constructor");

    }

    void displayDog() {

        displayAnimal();

        System.out.println("Breed : " + breed);

    }

}