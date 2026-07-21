package CoreJava.B01_OOPs.oops_4_pillers.Abstraction.Interface;

interface Test{
    abstract void f1();
 }
 abstract class test2{
    void f2(){
        System.out.println("from abstract class i am f2...");
    }
    abstract void f1();
     int id = 10;
    public test2(){
        System.out.println("constructor of abstract class...");

    }
 }
 public class InterfaceDemo implements Test {
    public void f1(){
        System.out.println("from interfaceDemo....");

    }

    public static class demo extends test2{

        public demo(){
            System.out.println("Constructor of a demo class ");
            super();

        }
        void f1() {
            System.out.println("hello from demo....!");
        }

    }
    static void main(String[] args) {
        InterfaceDemo obj = new InterfaceDemo();
        test2 obj2 = new demo();

        }
    }

