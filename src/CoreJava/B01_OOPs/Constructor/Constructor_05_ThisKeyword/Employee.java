package CoreJava.B01_OOPs.Constructor.Constructor_05_ThisKeyword;

public class Employee {

    int id;
    String name;

    Employee(int id,String name){

        this.id = id;
        this.name = name;

    }

    void show(){

        System.out.println("Employee ID : " + id);
        System.out.println("Employee Name : " + name);

    }

    void receiveObject(Employee emp){

        System.out.println("\nObject Received");

        emp.show();

    }

    void passCurrentObject(){

        System.out.println("\nPassing Current Object");

        receiveObject(this);

    }

}