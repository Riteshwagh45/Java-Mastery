package CoreJava.B01_OOPs.Constructor.Constructor_07_SuperConstructor;

public class Cat extends Animal {

    String color;

    Cat(String name,int age,String color){

        super(name,age);

        this.color = color;

        System.out.println("Cat Constructor");

    }

    void displayCat(){

        displayAnimal();

        System.out.println("Color : " + color);

    }
}