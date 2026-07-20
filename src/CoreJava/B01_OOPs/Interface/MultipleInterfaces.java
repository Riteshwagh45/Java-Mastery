package CoreJava.B01_OOPs.Interface;

public class MultipleInterfaces {
    interface Printable{
        void Print();

    }
    interface Showable{
        void show();

    }
   static class Document implements Printable , Showable{
        @Override
        public void Print() {
            System.out.println("this is print...From Printable interface");
        }
        public void show(){
            System.out.println("show from Showable interface...");
        }
    }

    static void main(String[] args) {
        Document obj1 = new Document();
        obj1.Print();
        obj1.show();
    }
}
