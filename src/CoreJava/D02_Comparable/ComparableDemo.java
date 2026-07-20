package CoreJava.D02_Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo  {
    static class Student implements Comparable<Student>{
        int rollNo;
        String name;
        int Age;

        public Student(int rollNo, String name, int age) {
            this.rollNo = rollNo;
            this.name = name;
            Age = age;
        }

        @Override
        public int compareTo(Student o) {
            return Integer.compare(o.Age , this.Age);
        }

        @Override
        public String toString() {
            return "Student{" +
                    "rollNo=" + rollNo +
                    ", name='" + name + '\'' +
                    ", Age=" + Age +
                    '}';
        }
    }
    public static void main(String[] args){
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(101,"ritesh",25));
        list.add(new Student(102,"gitesh",22));
        list.add(new Student(103,"shubham",20));
        Collections.sort(list);

        System.out.println(list);
    }
}
